package chap04;

/*
 * 2�ܺ��� 9�ܱ����� ������ ����� �׸��� ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
 * 
 * */


public class Gugudan {

	public static void main(String[] args) {

		
		/*for (int i=0; i<=9; i++) {
		
			for (int j=2; j<=9; j++) {
			
				if(i > 0)
					System.out.printf("%d * %d = %d\t", j, i, j*i);
				else
					System.out.printf(" [ %d �� ] \t", j);
			}
			
			System.out.println("\t");
		}*/
		
		int i=0, j=2;
		
		while(i<=9) {
			
			while(j<=9) {
				
				if(i > 0)
					System.out.printf("%d * %d = %d\t", j, i, j*i);
				else
					System.out.printf(" [ %d �� ] \t", j);
				
			}
			
			System.out.println("\t");
		}

	}

}