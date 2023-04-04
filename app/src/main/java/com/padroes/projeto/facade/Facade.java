package com.padroes.projeto.facade;

import com.padroes.subsistema1.crm.CrmService;
import com.padroes.subsistema2.cep.CepApi;

public class Facade {
    public Cliente migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);
        if(CrmService.gravarCliente(nome, cep, cidade, estado)){
            return new Cliente(nome, cep, cidade, estado);
        }

        return null;
    }
}
