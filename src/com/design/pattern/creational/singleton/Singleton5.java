package com.design.pattern.creational.singleton;

public class Singleton5 {
	
	private static Singleton5 instance = null;
	
	private Singleton5(){
	}
	
	public static Singleton5 getInstance(){
		if(instance == null){
			synchronized (Singleton5.class) {
				if (instance == null) {
		            instance = new Singleton5();
		        }
			}
		}
		return instance;
	}
	
}
