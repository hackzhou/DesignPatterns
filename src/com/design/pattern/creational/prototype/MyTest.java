package com.design.pattern.creational.prototype;

public class MyTest {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.setAge(28);
		person.setName("Hack");
		person.setParent(new Parent(55));
		System.out.println("真身：" + person.toString());
		
		try {
			Person person2 = (Person) person.clone();
			Parent parent1 = person2.getParent();
			parent1.setAge(60);
			System.out.println("=====");
			System.out.println("真身：" + person.toString()); //引用被改变，不彻底
			System.out.println("克隆1：" + person2.toString());
			
//			Person person3 = (Person) person.deepClone();
//			Parent parent2 = person3.getParent();
//			parent2.setAge(60);
//			System.out.println("=====");
//			System.out.println("真身：" + person.toString()); //引用不会被改变，彻底
//			System.out.println("克隆1：" + person3.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
