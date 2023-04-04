package com.padroes.projeto.singleton;

/**
* Singleton "Lazy Holder"
* @author Bruno
*/
public class SingletonLazyHolder {

	private static class InstanceHolder{
		private static SingletonLazyHolder instance = new SingletonLazyHolder();
	}
    
	
	private SingletonLazyHolder(){
		
	}
	
	public static SingletonLazyHolder getInstance(){
		return InstanceHolder.instance;
	}
}
