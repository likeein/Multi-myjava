package chap03;

import java.util.Scanner;

/**
 * 
 * 거스름돈 교환 프로그램을 다음과 같이 생성하세요.
 * 단, 단위가 큰 동전을 우선으로 교환합니다.
 * 가능하면 하나의 변수만 사용합니다. 
 * 
 * [실행 결과]
 * 
 * 계산하실 금액을 입력하세요 : 10000
 * 구매하신 금액을 입력하세요 : 6234
 * 
 * 거스름돈 : 3766
 * 500원 짜리 동전 : 13개
 * 100원짜리 동전 : 2개 
 * 50원짜리 동전 : 1개 
 * 10원짜리 동전 : 1개 
 * 나머지 거스름돈 : 6원
 */


public class Exam2 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int money;
		
		System.out.println("계산하실 금액을 입력하세요 : ");
		
		money = scanner.nextInt();
		
		System.out.println("구매하신 금액을 입력하세요 : ");
		
		money -= scanner.nextInt();
		scanner.close();
		
		System.out.println("거스름돈 : " + money + "원");
		
		System.out.println("500원짜리 동전 : " + (money/500) + "개");
		money %= 500;
		
		System.out.println("100원짜리 동전 : " + (money/100) + "개");
		money %= 100;
		
		System.out.println("50원짜리 동전 : " + (money/50) + "개");
		money %= 50;
		
		System.out.println("10원짜리 동전 : " + (money/10) + "개");
		money %= 10;
		
		System.out.println("나머지 거스름돈 : " + money + "원");

	}

}
