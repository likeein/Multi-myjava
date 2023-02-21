package chap07pacA;

public class Parent {
	
	private int num1;
	int num2;
	
	public Parent(){
		this.num1 = 1234;
		this.num2 = 4321;
	}
	
	protected int methodA() {
		return this.num1 ;
	}
	
	public int methodB() {
		return this.num2;
	}
}

/*
 * protected 멤버는 부모와 서로 다른 
 * */
