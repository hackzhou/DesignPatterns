package com.design.pattern.creational.prototype;

public class Person extends Prototype{
	private static final long serialVersionUID = 1L;
	
	private int age;
	private String name;
	private Parent parent;
	
	public Person() {
		super();
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Parent getParent() {
		return parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", parent=" + parent + "]";
	}

}
