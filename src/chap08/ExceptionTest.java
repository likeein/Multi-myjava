package chap08;

public class ExceptionTest {

	void methodA() throws Exception{
		Exception e = new Exception("methodA 예외발생 !");
		
		throw e;
		
	}
	
	void methodB() {
		try {
			methodA();
		}catch(Exception e) {
			System.out.println("methodB에서 대신 예외 처리");
			System.out.println(e.getMessage());
		}
	}
	
	void methodC() {
		throw new RuntimeException("methodC() 예외발생!");
		
	}
	
	void methodD() {
		methodC();
	}
	
	//아래에 methodB()를 호출하여 프로그램을 실행하는 코드를 추가하세요.
	public static void main(String [] args) {
		ExceptionTest test = new ExceptionTest();
		
		try {
			test.methodD();
		}catch(RuntimeException e) {
			System.out.println("main() 메서드에서 예외 처리 !");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		/*
		try {
			test.methodB();
		}catch(Exception e) {
			System.out.println("main() 메서드에서 예외 처리 !");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}*/
		
	}
}
