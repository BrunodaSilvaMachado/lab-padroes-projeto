package com.padroes.projeto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.padroes.projeto.facade.Cliente;
import com.padroes.projeto.facade.Facade;

public class FacadeTest {
    @Test
    public void facadeTest(){
        Facade f = new Facade();
        Cliente cliente = f.migrarCliente("Venilton", "14801788");
        Cliente clienteMock = new Cliente("Venilton", "14801788", "Araraquara", "SP");

        assertEquals(cliente.toString(), clienteMock.toString());
    }
}
