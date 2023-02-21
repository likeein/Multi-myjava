package chap07;

import chap07pacA.interfaceA;

public interface InterfaceB extends interfaceA{
	
	int num = 1234;

	void methodB();
	
	default void defaultMethod() {
		System.out.println("InterfaceB.defaultMethod() 호출 !");
		System.out.println("num : " + num);
	}
	
	static void staticMethod() {
		System.out.println("InterfaceB.defaultMethod() 호출 !");
		System.out.println("num : " + num);
	}
}
