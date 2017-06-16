package com.design.pattern.creational.singleton;

public class Singleton6 {
	
	private static class SingletonFactory {
		private static Singleton6 instance = new Singleton6();
	}
	
	private Singleton6(){
	}
	
	public static Singleton6 getInstance(){
		return SingletonFactory.instance;
	}

}
