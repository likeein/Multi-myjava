package chap04;

import java.util.Scanner;

/*
 * [���� ������ ���� ��� ���α׷� �ۼ��ϱ�]
 * 
 * ����ڿ��� �⵵�� ���� �Է¹޾� �ش� ���� ������ ���ڸ� ����ϴ� �ڵ带 �ۼ��ϼ���.
 * 
 * [���� ��1]								[���� ��2]
 * �⵵�� ���� �Է��ϼ��� : 2023 1				�⵵�� ���� �Է��ϼ��� : 2020 2
 * 2023�� 1���� ������ ���ڴ� 31 �Դϴ�.			2020���� 2���� ������ ���ڴ� 29�Դϴ�. 
 * 
 * [�� ���� ������ ����]
 * 1. ū�� : 1. 3. 5. 7. 8. 10. 12 => 31�� 
 * 2. ������ : 4, 6, 9, 11 => 30��
 * 3. 2��: ���� => 29��, ��� => 28��
 * 
 *		2020 : ����, 	2100 : ���, 2000 : ����, 2023 : ���
 * */

public class Exam3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("�⵵�� ���� �Է��ϼ��� : ");
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
				System.out.println(year + "��" + mon + "���� ������ ���ڴ� 31�� �Դϴ�.");
				break;
				
			case 4: 
			case 6:
			case 9: 
			case 11: 
				System.out.println(year + "��" + mon + "���� ������ ���ڴ� 30�� �Դϴ�.");
				break;
				
			case 2:
				if (year%4==0 && year%100!=0 || year%400==0) {
					System.out.println(year + "��" + mon + "���� ������ ���ڴ� 29�� �Դϴ�.");
				}else 
					System.out.println(year + "��" + mon + "���� ������ ���ڴ� 28�� �Դϴ�.");
				break;
				
		}
		
	}

}
