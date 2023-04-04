package com.padroes.projeto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.padroes.projeto.singleton.SingletonEager;
import com.padroes.projeto.singleton.SingletonLazy;
import com.padroes.projeto.singleton.SingletonLazyHolder;

/*
 * Testes relacionados ao padrão de projeto Singleton
 */

public class SingletonTest {
    @Test
    void singletonLazyTest(){
        SingletonLazy a = SingletonLazy.getInstance();
        SingletonLazy b = SingletonLazy.getInstance();

        assertEquals(a, b);
    }

    @Test
    void singletonEagerTest(){
        SingletonEager a = SingletonEager.getInstance();
        SingletonEager b = SingletonEager.getInstance();

        assertEquals(a, b);
    }

    @Test
    void singletonLazyHolderTest(){
        SingletonLazyHolder a = SingletonLazyHolder.getInstance();
        SingletonLazyHolder b = SingletonLazyHolder.getInstance();

        assertEquals(a, b);
    }

}
