package com.design.pattern.creational.singleton;

public class Singleton3 {
	
	private static Singleton3 instance = null;
	
	public Singleton3(){
	}
	
	public static synchronized Singleton3 getInstance(){
		if(instance == null){
			instance = new Singleton3();
		}
		return instance;
	}

}
