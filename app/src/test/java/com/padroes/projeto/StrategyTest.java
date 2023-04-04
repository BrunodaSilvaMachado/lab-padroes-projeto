package com.padroes.projeto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.padroes.projeto.strategy.ComportamentoAgressivo;
import com.padroes.projeto.strategy.ComportamentoDefensivo;
import com.padroes.projeto.strategy.ComportamentoNormal;
import com.padroes.projeto.strategy.Robo;

public class StrategyTest {
    @Test
    public void comportamentoNormalTest(){
        ComportamentoNormal c = new ComportamentoNormal();
        Robo robo = new Robo();
        robo.setComportamento(c);
        assertEquals(robo.mover(), "Movendo-se Normalmente ...");
    }

    @Test
    public void comportamentoDefensivoTest(){
        ComportamentoDefensivo c = new ComportamentoDefensivo();
        Robo robo = new Robo();
        robo.setComportamento(c);
        assertEquals(robo.mover(), "Movendo-se Defensivamente ...");
    }

    @Test
    public void comportamentoAgressivoTest(){
        ComportamentoAgressivo c = new ComportamentoAgressivo();
        Robo robo = new Robo();
        robo.setComportamento(c);
        String ret = robo.mover();
        assertEquals(ret, "Movendo-se Agressivamente ...");
    }
}
