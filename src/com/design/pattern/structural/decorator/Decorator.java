package com.design.pattern.structural.decorator;

public class Decorator implements ISource{
	
	private ISource source;
	
	public Decorator(ISource source) {
		super();
		this.source = source;
	}

	@Override
	public void method() {
		System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
	}

}
