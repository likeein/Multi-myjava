package chap06;

import java.util.Arrays;
import java.util.Random;

/*
 * ũ�Ⱑ 6�� ������ �迭�� ����� 1���� 45 ������ �ߺ����� �ʴ� �ζ� ��ȣ 6���� �����Ͽ�
 * ũ�� ������� ������ �� ����ϴ� �ڵ带 �ۼ��ϼ���.
 * 
 * ��, Lotto Ŭ������ �����ϰ�, ��ü���������� ������ �ذ��ϴ� �ڵ带 �ۼ��ϼ���.
 * 
 *  [���� ��]
 *  
 *  �ζ� ��ȣ : 3 14 21 29 33 42
 * */



public class Exam1 {

	public static void main(String[] args) {
		
		Lotto lotto = new Lotto();
		System.out.println("�ζǹ�ȣ : " + Arrays.toString(lotto.getLotto()));
		
		lotto.setLotto();
		System.out.println("�ζǹ�ȣ : " + Arrays.toString(lotto.getLotto()));
	}
}
