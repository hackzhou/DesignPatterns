package com.design.pattern.structural.adapter.classa;

public class MyTest {
	
	public static void main(String[] args) {
		
		//类的适配器模式：当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。
		//这样Targetable接口的实现类就具有了Source类的功能。
		Adapter adapter = new Adapter();
		adapter.method1();
		adapter.method2();
		
	}

}
