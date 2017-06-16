package com.design.pattern.structural.adapter.classa;

public class Adapter extends Source implements ITarge{
	
	@Override
	public void method2() {
		System.out.println("this is Adapter method !");
	}

}
