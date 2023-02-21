package chap07;

public class InterfaceTest {

	public static void main(String[] args) {
		
		InterfaceB b = new InterfaceImpl();
		
		System.out.println(InterfaceB.num);
		System.out.println(b.num);

		b.methodB();
		
		b.defaultMethod();
		
		InterfaceB.staticMethod();
	}

}
