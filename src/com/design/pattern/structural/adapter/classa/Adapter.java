package com.design.pattern.structural.adapter.classa;

public class Adapter extends Source implements Targetable{
	
	@Override
	public void method2() {
		System.out.println("this is Adapter method !");
	}

}
