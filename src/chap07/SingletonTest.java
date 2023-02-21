package chap07;

public class SingletonTest {

	public static void main(String[] args) {
		
		Singleton s1, s2, s3;
		
		//s1 = new SingletonTest();
		
		s1 = Singleton.getInstance();
		s2 = Singleton.getInstance();
		s3 = Singleton.getInstance();

		
		if(s1 == s2) {
			System.out.println("s1과 s2는 하나의 인스턴스를 가리키고 있습니다. ");
		}
		
		if(s2 == s3) {
			System.out.println("s2과 s3는 하나의 인스턴스를 가리키고 있습니다. ");
		}
	}

}
