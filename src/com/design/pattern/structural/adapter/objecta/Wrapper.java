package com.design.pattern.structural.adapter.objecta;

import com.design.pattern.structural.adapter.classa.Source;
import com.design.pattern.structural.adapter.classa.Targetable;

public class Wrapper implements Targetable{
	
	private Source source;
	
	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("this is Wrapper method !");
	}

}
