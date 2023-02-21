package chap07.polymorphism;

public class Test {

	public static void main(String[] args) {
		
//		Child c = new Child();
//		Parent p = c;
		
		/*
		Parent p = new Child();
		p.methodA();
		//p.methodB(); => 왜 사용할 수 없을까 ?

		
		//Child 인스턴스를 생성했으니 methodB()를 사용하도록 할 수 없을까 ?
		Child c = (Child)p;
		c.methodB();*/
		
		/*
		Parent p = new Parent();
		Child c = (Child)p;
		c.methodA();  //compile(ok), runtime(x, ClasCastException)
		*/
		
		/*
		Other o = new Other;
		Parent p= (Parent)o; //상속 관계가 아닌 다른 클래스는 클래스의 형변환 대상이 아님.
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
		
		//Object 클래스 타입의 레퍼런스는 모든 자바 클래스의 인스턴스를 가리킬 수 있음
		// 하지만 문제가 있다 ? 무엇일까 ?
		// 어떻게 문제를 해결할 수 있을까 ?
	
		/*
		 * Object obj; obj = new Parent(); ((Parent)obj).methodA(); obj = new Child();
		 * ((Child)obj).methodB(); obj = new Other(); ((Other)obj).methodC();
		 */
	}

}
