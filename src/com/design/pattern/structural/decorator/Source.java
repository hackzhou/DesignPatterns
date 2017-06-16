package com.design.pattern.structural.decorator;

import com.design.pattern.structural.decorator.ISource;

public class Source implements ISource {

	@Override
	public void method() {
		System.out.println("this is Source method!");
	}

}
