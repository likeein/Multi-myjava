package chap08;

public class ExceptionTest {

	void methodA() throws Exception{
		Exception e = new Exception("methodA ���ܹ߻� !");
		
		throw e;
		
	}
	
	void methodB() {
		try {
			methodA();
		}catch(Exception e) {
			System.out.println("methodB���� ��� ���� ó��");
			System.out.println(e.getMessage());
		}
	}
	
	void methodC() {
		throw new RuntimeException("methodC() ���ܹ߻�!");
		
	}
	
	void methodD() {
		methodC();
	}
	
	//�Ʒ��� methodB()�� ȣ���Ͽ� ���α׷��� �����ϴ� �ڵ带 �߰��ϼ���.
	public static void main(String [] args) {
		ExceptionTest test = new ExceptionTest();
		
		try {
			test.methodD();
		}catch(RuntimeException e) {
			System.out.println("main() �޼��忡�� ���� ó�� !");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		/*
		try {
			test.methodB();
		}catch(Exception e) {
			System.out.println("main() �޼��忡�� ���� ó�� !");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}*/
		
	}
}
