package chap04;

import java.util.*;

/*
 * ����ڿ��� ����� ���� ������ �Է� �޾� ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
 * 
 * 1) ����� ���� ���� ��� 80�� �̻��̸� �հ� 
 * 2) ����� ���� ���� �� �� �����̶� 60�� �̸��̸� ����
 * 3) ����� ���� ���� ��� 80�� �̻��̸� �հ� 
 * 		��, �� AND ������ (& or &&)�� ����� �� �����ϴ�. 
 * 
 * 		����� ���� ���� ��� 80�� �̻��̸� �հ� <- -> ����� ���� ���� �� �� �����̶� 80�� �̸��̸� ����
 * */

public class Exam1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ������ �Է��ϼ���. : ");
		int eng = sc.nextInt();
		
		System.out.println("���� ������ �Է��ϼ���. : ");
		int math = sc.nextInt();
		
		/* 1�� ����
		 * if(eng >= 80 & math >= 80) { 
		 * 	System.out.println("�հ�"); 
		 * } 
		 * else
		 * 	System.out.println("���հ�");
		 */
		
		/* 2�� ����
		 * if (eng < 60 | math < 60) { 
		 * 	System.out.println("���� ����"); 
		 * } 
		 * else
		 * 	System.out.println("���� ����");
		 */

		/* 3�� ����
		 * if (!(eng < 80 | math < 80)) { 
		 * 	System.out.println("���հ�"); 
		 * } 
		 * else
		 * 	System.out.println("�հ�);
		 */
	}

}
