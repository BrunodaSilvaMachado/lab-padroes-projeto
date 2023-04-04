package com.padroes.projeto.singleton;

/**
* Singleton "Apressado"
* @author Bruno
*/
public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();
	
	private SingletonEager(){
		
	}
	
	public static SingletonEager getInstance(){
		return instance;
	}
}
