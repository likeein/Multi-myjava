package chap07;

import java.util.Scanner;

/*
 * [요일 계산 프로그램] => 객체지향으로 만들기
 * 
 * 사용자에게 년, 월, 일을 입력 받아 사용 예와 같이 입력받은 날짜의 요일을 반환하는 코드를 작성하세요.
 * 단, 외부 라이브러리는 사용하지 않고 모든 기능은 main() 메서드 안에서 직접 구현합니다. 
 *  
 * <실행 예>
 * 날짜를 입력하세요 : 2023 1 18
 * 입력하신 2023년 1월 18일은 수요일 입니다. 
 * 
 * [힌트 !!!]
 * 1. 서기 1년 1월 1일은 월요일입니다. => 서기 1년 2월 1일은 ?
 * 
 *  [서기 1년 1월 1일로부터 사용자가 입력한 날짜까지의 전체 총 일수를 구하는 방법]
 *  1. 서기 1년부터 사용자가 입력한 년도의 전년도까지의 총 일수 계산 
 *  2. 사용자가 입력한 년도의 1월부터 사용자가 입력한 월까지의 일 수를 총 일수에 합산
 *  3. 사용자가 입력한 일수를 총 일수에 합산
 *  
 * 2. 요일 계산은 전체 총 일수를 7로 나눈 나머지 값을 이용하여 일요일부터의 요일을 계산합니다. 
 *  
 * [Hint!] 윤년 계산과 각 월의 마지막 일자 계산을 활용합니다. 
 *  
 * */

public class Exam2 {

	public static void main(String[] args) {

		MyDate myDate;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("날짜를 입력하세요(ex. 2023 12 25) : ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		sc.close();
		
		myDate = new MyDate(year, month, day);
		
		System.out.println("입력하신 " + year + "년 " + month + "월 " + day +"일은 " + myDate.getWeekdays() + "요일 입니다.");
	}

}
