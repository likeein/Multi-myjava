package chap04;

import java.util.Scanner;

/*
 * 사용자에게 2단부터 9단 사이의 구구단의 단을 입력받아 해당 구구단의 결과를 출력하는 코드를 작성하세요.
 * */

public class Gugudan1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단의 단을 입력하세요 : ");
		
		int num = sc.nextInt();
		sc.close();
		
		for (int i=1; i<=9; i++) {
			System.out.println(num + "*" + i + "=" + num*i);
		}

	}

}
