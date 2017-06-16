package com.design.pattern.structural.proxy;

public class Proxy implements ISource {
	
	private ISource source;

	public Proxy() {
		super();
		this.source = new Source();
	}

	@Override
	public void method() {
		System.out.println("after proxy!");
        source.method();
        System.out.println("before proxy!");
	}

}
