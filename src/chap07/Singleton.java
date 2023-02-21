package chap07;

public class Singleton {

	static private Singleton s = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		
		return s;
	}
}
