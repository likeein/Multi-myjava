package chap03;

import java.util.Scanner;

/*
 *  사용자에게 하나의 실수를 입력 받아 다음의 결과를 출력하는 코드를 작성하세요. 
 *  
 *  [실행결과1]								[실행결과 2]
 *  
 *  하나의 실수를 입력하세요 : 3.64				하나의 실수를 입력하세요 : 3.27
 *  
 *  버람 : 3								버림 : 3
 *  반올림 : 4								반올림 : 3
 * */

public class Exam1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num;
		
		System.out.println("하나의 실수를 입력하세요. : ");
		
		num=sc.nextDouble(); // 입력한 값 넣기
		
		sc.close(); //스캐너 닫기
		
		System.out.println("버림 : " + (int)num);
		System.out.println("반올림 : " + (int)(num + 0.5));

	}

}
