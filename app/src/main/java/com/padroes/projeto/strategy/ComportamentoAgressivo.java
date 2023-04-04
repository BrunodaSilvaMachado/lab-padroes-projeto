package com.padroes.projeto.strategy;

public class ComportamentoAgressivo implements Comportamento {

    @Override
    public String mover() {
        return("Movendo-se Agressivamente ...");
    }
    
}
