package chap04;

/*
 * 2�ܺ��� 9�ܱ����� �������� ����� ����ϴ� �ڵ带 �ۼ��ϼ���. 
 * ��, ��ø �ݺ����� ����� �� ���� �ϳ��� for �ݺ����� ����մϴ�. 
 * */

public class Gugudan2 {

	public static void main(String[] args) {
		
		System.out.println("2�ܺ��� 9�ܱ����� ������");
		
		/*
		 * int num = 1, dan = 2;
		 * 
		 * for (int i=0; i< 72; i++) {
		 * 
		 * System.out.println(dan + "*" + num + "=" + num*dan);
		 * 
		 * num++;
		 * 
		 * if (num == 10) { num = 1; dan++; }
		 * 
		 * }
		 */
		
		for (int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}

	}

}
