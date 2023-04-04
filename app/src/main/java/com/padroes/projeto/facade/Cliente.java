package com.padroes.projeto.facade;

/**
 * Cliente
 */
public class Cliente {

    private String nome;
    private String cep;
    private String cidade;
    private String estado;

    public Cliente() {
    }

    public Cliente(String nome, String cep, String cidade, String estado) {
        this.nome = nome;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", cep=" + cep + ", cidade=" + cidade + ", estado=" + estado + "]";
    }

    
}