package chap07pacA;

public class IHTest {

	public static void main(String[] args) {
		
		IH ih = new IH(95);
		
		System.out.println(ih.getScore());
		
		ih.setScore(90);
		System.out.println(ih.getScore());

	}

}
