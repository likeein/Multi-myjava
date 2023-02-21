package chap07;

import chap07pacA.interfaceA;

public class InterfaceImpl implements InterfaceB{

	public void methodA() {
		System.out.println("InterfaceA.methodA() 재정의 !");
	}
	
	public void methodB() {
		System.out.println("InterfaceA.methodB() 재정의 !");
	}
}
