package chap03;

import java.util.Scanner;

/*
 *  ����ڿ��� �ϳ��� �Ǽ��� �Է� �޾� ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���. 
 *  
 *  [������1]								[������ 2]
 *  
 *  �ϳ��� �Ǽ��� �Է��ϼ��� : 3.64				�ϳ��� �Ǽ��� �Է��ϼ��� : 3.27
 *  
 *  ���� : 3								���� : 3
 *  �ݿø� : 4								�ݿø� : 3
 * */

public class Exam1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num;
		
		System.out.println("�ϳ��� �Ǽ��� �Է��ϼ���. : ");
		
		num=sc.nextDouble(); // �Է��� �� �ֱ�
		
		sc.close(); //��ĳ�� �ݱ�
		
		System.out.println("���� : " + (int)num);
		System.out.println("�ݿø� : " + (int)(num + 0.5));

	}

}
