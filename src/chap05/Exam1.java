package chap05;

import java.util.Arrays;
import java.util.Random;

/*
 * 크기가 6인 정수형 배열을 만들고 1부터 45 사이의 중복되지 않는 로또 번호 6개를 생성하여
 * 크기 순서대로 저장한 후 출력하는 코드를 작성하세요.
 * 
 *  [실행 예]
 *  
 *  로또 번호 : 3 14 21 29 33 42
 * */

public class Exam1 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6]; //lotto 이외의 다른 배열 생성 금지 !!!!
		int lottoNum, temp;
		
		for(int i=0; i<lotto.length; i++) {
			while(true) {
				boolean isDuplicate = false; //중복이 안된 로또 번호
				lottoNum = (int)(Math.random() * 45) + 1 ;
				
				for (int j=0; j<lotto.length; j++) {
					if(lottoNum == lotto[j]) {
						isDuplicate = true;
						break;
					}
				}
				
				if(!isDuplicate) {
					lotto[i] = lottoNum;
					break;
				}
			}
		}
		
		for(int i=0; i<lotto.length -1; i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		
		System.out.println("로또 번호: " + Arrays.toString(lotto));
		
		/*
		 * Random random = new Random();
		 * 
		 * for(int i=0; i<lotto.length; i++) { lotto[i] = random.nextInt(45) + 1;
		 * for(int j=0; j<i; j++) { if(lotto[i] == lotto[j]) { i --; break; } } }
		 * 
		 * for(int i=0; i<lotto.length; i++) { for (int j= i + 1; j<lotto.length; j++) {
		 * if(lotto[i] > lotto[j]) { int temp = lotto[i]; lotto[i] = lotto[j]; lotto[j]
		 * = temp; } } }
		 * 
		 * System.out.println("로또 번호 : " + Arrays.toString(lotto));
		 */
	}

}
