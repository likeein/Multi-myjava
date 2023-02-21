package chap04;

/*
 * 2단부터 9단까지의 구구단 결과를 그림과 같이 출력하는 코드를 작성하세요.
 * 
 * */


public class Gugudan {

	public static void main(String[] args) {

		
		/*for (int i=0; i<=9; i++) {
		
			for (int j=2; j<=9; j++) {
			
				if(i > 0)
					System.out.printf("%d * %d = %d\t", j, i, j*i);
				else
					System.out.printf(" [ %d 단 ] \t", j);
			}
			
			System.out.println("\t");
		}*/
		
		int i=0, j=2;
		
		while(i<=9) {
			
			while(j<=9) {
				
				if(i > 0)
					System.out.printf("%d * %d = %d\t", j, i, j*i);
				else
					System.out.printf(" [ %d 단 ] \t", j);
				
			}
			
			System.out.println("\t");
		}

	}

}