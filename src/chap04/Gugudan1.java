package chap04;

import java.util.Scanner;

/*
 * ����ڿ��� 2�ܺ��� 9�� ������ �������� ���� �Է¹޾� �ش� �������� ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
 * */

public class Gugudan1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� ���� �Է��ϼ��� : ");
		
		int num = sc.nextInt();
		sc.close();
		
		for (int i=1; i<=9; i++) {
			System.out.println(num + "*" + i + "=" + num*i);
		}

	}

}
