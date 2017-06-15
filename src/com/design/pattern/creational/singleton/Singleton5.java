package com.design.pattern.creational.singleton;

public class Singleton5 {
	
	private static class SingletonFactory {
		private static Singleton5 instance = new Singleton5();
	}
	
	private Singleton5(){
	}
	
	public static Singleton5 getInstance(){
		return SingletonFactory.instance;
	}

}
