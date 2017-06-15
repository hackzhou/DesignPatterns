package com.design.pattern.creational.prototype;

import java.io.Serializable;

public class Parent implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int age;
	
	public Parent() {
		super();
	}
	public Parent(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Parent [age=" + age + "]";
	}

}
