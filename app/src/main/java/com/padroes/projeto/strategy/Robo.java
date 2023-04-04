package com.padroes.projeto.strategy;

public class Robo {
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public String mover(){
        return comportamento.mover();
    }
}
