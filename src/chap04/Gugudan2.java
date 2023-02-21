package chap04;

/*
 * 2단부터 9단까지의 구구단의 결과를 출력하는 코드를 작성하세요. 
 * 단, 중첩 반복문은 사용할 수 없고 하나의 for 반복문만 사용합니다. 
 * */

public class Gugudan2 {

	public static void main(String[] args) {
		
		System.out.println("2단부터 9단까지의 구구단");
		
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
