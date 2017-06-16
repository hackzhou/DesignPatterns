package com.design.pattern.structural.adapter.interfacea;

public class MyTest {
	
	public static void main(String[] args) {
		
		//接口的适配器模式：当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可。
		ISource sourceable1 = new SourceSub1();
		sourceable1.method1();
		sourceable1.method2();
//		Sourceable sourceable2 = new SourceSub2();
//		sourceable2.method1();
//		sourceable2.method2();
	}

}
