package chap06;

import java.util.Arrays;
import java.util.Random;

/*
 * 크기가 6인 정수형 배열을 만들고 1부터 45 사이의 중복되지 않는 로또 번호 6개를 생성하여
 * 크기 순서대로 저장한 후 출력하는 코드를 작성하세요.
 * 
 * 단, Lotto 클래스를 생성하고, 객체지향적으로 문제를 해결하는 코드를 작성하세요.
 * 
 *  [실행 예]
 *  
 *  로또 번호 : 3 14 21 29 33 42
 * */



public class Exam1 {

	public static void main(String[] args) {
		
		Lotto lotto = new Lotto();
		System.out.println("로또번호 : " + Arrays.toString(lotto.getLotto()));
		
		lotto.setLotto();
		System.out.println("로또번호 : " + Arrays.toString(lotto.getLotto()));
	}
}
