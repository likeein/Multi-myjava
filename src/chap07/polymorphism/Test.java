package chap07.polymorphism;

public class Test {

	public static void main(String[] args) {
		
//		Child c = new Child();
//		Parent p = c;
		
		/*
		Parent p = new Child();
		p.methodA();
		//p.methodB(); => �� ����� �� ������ ?

		
		//Child �ν��Ͻ��� ���������� methodB()�� ����ϵ��� �� �� ������ ?
		Child c = (Child)p;
		c.methodB();*/
		
		/*
		Parent p = new Parent();
		Child c = (Child)p;
		c.methodA();  //compile(ok), runtime(x, ClasCastException)
		*/
		
		/*
		Other o = new Other;
		Parent p= (Parent)o; //��� ���谡 �ƴ� �ٸ� Ŭ������ Ŭ������ ����ȯ ����� �ƴ�.
		*/
		
		/*
		Parent p = new Parent();
		Child c = new Child();
		Other o = new Other();
		
		Object obj;
		obj = p;
		obj = c;
		obj = o;
		*/
		
		//Object Ŭ���� Ÿ���� ���۷����� ��� �ڹ� Ŭ������ �ν��Ͻ��� ����ų �� ����
		// ������ ������ �ִ� ? �����ϱ� ?
		// ��� ������ �ذ��� �� ������ ?
	
		/*
		 * Object obj; obj = new Parent(); ((Parent)obj).methodA(); obj = new Child();
		 * ((Child)obj).methodB(); obj = new Other(); ((Other)obj).methodC();
		 */
	}

}
