package chap04;

import java.util.*;

/*
 * 사용자에게 영어와 수학 점수를 입력 받아 다음의 결과를 출력하는 코드를 작성하세요.
 * 
 * 1) 영어와 수학 점수 모두 80점 이상이면 합격 
 * 2) 영어와 수학 점수 중 한 과목이라도 60점 미만이면 과락
 * 3) 영어와 수락 점수 모두 80점 이상이면 합격 
 * 		단, 논리 AND 연산자 (& or &&)는 사용할 수 없습니다. 
 * 
 * 		영어와 수학 점수 모두 80점 이상이면 합격 <- -> 영어와 수학 점수 중 한 과목이라도 80점 미만이면 과락
 * */

public class Exam1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영어 점수를 입력하세요. : ");
		int eng = sc.nextInt();
		
		System.out.println("수학 점수를 입력하세요. : ");
		int math = sc.nextInt();
		
		/* 1번 문제
		 * if(eng >= 80 & math >= 80) { 
		 * 	System.out.println("합격"); 
		 * } 
		 * else
		 * 	System.out.println("불합격");
		 */
		
		/* 2번 문제
		 * if (eng < 60 | math < 60) { 
		 * 	System.out.println("과락 있음"); 
		 * } 
		 * else
		 * 	System.out.println("과락 없음");
		 */

		/* 3번 문제
		 * if (!(eng < 80 | math < 80)) { 
		 * 	System.out.println("불합격"); 
		 * } 
		 * else
		 * 	System.out.println("합격);
		 */
	}

}
