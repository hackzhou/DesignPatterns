package com.design.pattern.creational.singleton;

public class Singleton1 {
	
	private static Singleton1 instance = new Singleton1();
	
	public Singleton1(){
	}
	
	public static Singleton1 getInstance(){
		return instance;
	}

}
