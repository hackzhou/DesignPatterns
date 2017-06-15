package com.design.pattern.creational.singleton;

public class Singleton4 {
	
	private static Singleton4 instance = null;
	
	public Singleton4(){
	}
	
	public static Singleton4 getInstance(){
		if(instance == null){
			synchronized (instance){
				if(instance == null){
					instance = new Singleton4();
				}
			}
		}
		return instance;
	}

}
