package com.padroes.subsistema1.crm;

public class CrmService {
    private CrmService(){}
    public static boolean gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente salvo no Sistema de CRM");
        return true;
    }
}
