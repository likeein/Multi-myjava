package chap05;

import java.util.Arrays;
import java.util.Random;

/*
 * ũ�Ⱑ 6�� ������ �迭�� ����� 1���� 45 ������ �ߺ����� �ʴ� �ζ� ��ȣ 6���� �����Ͽ�
 * ũ�� ������� ������ �� ����ϴ� �ڵ带 �ۼ��ϼ���.
 * 
 *  [���� ��]
 *  
 *  �ζ� ��ȣ : 3 14 21 29 33 42
 * */

public class Exam1 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6]; //lotto �̿��� �ٸ� �迭 ���� ���� !!!!
		int lottoNum, temp;
		
		for(int i=0; i<lotto.length; i++) {
			while(true) {
				boolean isDuplicate = false; //�ߺ��� �ȵ� �ζ� ��ȣ
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
		
		
		System.out.println("�ζ� ��ȣ: " + Arrays.toString(lotto));
		
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
		 * System.out.println("�ζ� ��ȣ : " + Arrays.toString(lotto));
		 */
	}

}
