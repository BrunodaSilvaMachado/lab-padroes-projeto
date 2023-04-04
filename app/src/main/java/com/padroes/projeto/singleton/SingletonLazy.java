package com.padroes.projeto.singleton;

/**
* Singleton "pregisoço"
* @author Bruno
*/
public class SingletonLazy {
    private static SingletonLazy instance;
	
	private SingletonLazy(){
		
	}
	
	public static SingletonLazy getInstance(){
		if(instance == null){
			instance = new SingletonLazy();
		}
		
		return instance;
	}
}