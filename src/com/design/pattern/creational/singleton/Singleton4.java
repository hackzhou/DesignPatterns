package com.design.pattern.creational.singleton;

public class Singleton4 {
	
	private static Singleton4 instance = null;
	
	private Singleton4(){
	}
	
	private static synchronized void syncInit() {  
        if (instance == null) {  
            instance = new Singleton4();  
        }  
    }
	
	public static Singleton4 getInstance(){
		if(instance == null){
			syncInit();
		}
		return instance;
	}
	
}
