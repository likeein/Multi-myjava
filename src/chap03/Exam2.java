package chap03;

import java.util.Scanner;

/**
 * 
 * �Ž����� ��ȯ ���α׷��� ������ ���� �����ϼ���.
 * ��, ������ ū ������ �켱���� ��ȯ�մϴ�.
 * �����ϸ� �ϳ��� ������ ����մϴ�. 
 * 
 * [���� ���]
 * 
 * ����Ͻ� �ݾ��� �Է��ϼ��� : 10000
 * �����Ͻ� �ݾ��� �Է��ϼ��� : 6234
 * 
 * �Ž����� : 3766
 * 500�� ¥�� ���� : 13��
 * 100��¥�� ���� : 2�� 
 * 50��¥�� ���� : 1�� 
 * 10��¥�� ���� : 1�� 
 * ������ �Ž����� : 6��
 */


public class Exam2 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int money;
		
		System.out.println("����Ͻ� �ݾ��� �Է��ϼ��� : ");
		
		money = scanner.nextInt();
		
		System.out.println("�����Ͻ� �ݾ��� �Է��ϼ��� : ");
		
		money -= scanner.nextInt();
		scanner.close();
		
		System.out.println("�Ž����� : " + money + "��");
		
		System.out.println("500��¥�� ���� : " + (money/500) + "��");
		money %= 500;
		
		System.out.println("100��¥�� ���� : " + (money/100) + "��");
		money %= 100;
		
		System.out.println("50��¥�� ���� : " + (money/50) + "��");
		money %= 50;
		
		System.out.println("10��¥�� ���� : " + (money/10) + "��");
		money %= 10;
		
		System.out.println("������ �Ž����� : " + money + "��");

	}

}
