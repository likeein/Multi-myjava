package chap04;

import java.util.Scanner;

/*
 * [월의 마지막 일자 계산 프로그램 작성하기]
 * 
 * 사용자에게 년도와 월를 입력받아 해당 월의 마지막 일자를 출력하는 코드를 작성하세요.
 * 
 * [실행 예1]								[실행 예2]
 * 년도와 월를 입력하세요 : 2023 1				년도와 월를 입력하세요 : 2020 2
 * 2023년 1월의 마지막 일자는 31 입니다.			2020년은 2월의 마지막 일자는 29입니다. 
 * 
 * [각 월의 마지막 일자]
 * 1. 큰달 : 1. 3. 5. 7. 8. 10. 12 => 31일 
 * 2. 작은달 : 4, 6, 9, 11 => 30일
 * 3. 2월: 윤년 => 29일, 평년 => 28일
 * 
 *		2020 : 윤년, 	2100 : 평년, 2000 : 윤년, 2023 : 평년
 * */

public class Exam3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("년도와 월을 입력하세요 : ");
		int year = sc.nextInt();
		int mon = sc.nextInt();
		sc.close();
		
		switch(mon) {
			
			case 1: 
			case 3:
			case 5: 
			case 7: 
			case 8: 
			case 10: 
			case 12:
				System.out.println(year + "년" + mon + "월의 마지막 일자는 31일 입니다.");
				break;
				
			case 4: 
			case 6:
			case 9: 
			case 11: 
				System.out.println(year + "년" + mon + "월의 마지막 일자는 30일 입니다.");
				break;
				
			case 2:
				if (year%4==0 && year%100!=0 || year%400==0) {
					System.out.println(year + "년" + mon + "월의 마지막 일자는 29일 입니다.");
				}else 
					System.out.println(year + "년" + mon + "월의 마지막 일자는 28일 입니다.");
				break;
				
		}
		
	}

}
