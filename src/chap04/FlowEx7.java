package chap04;

import java.util.*;

class FlowEx7 {
	public static void main(String[] args) { 
		int user, com;
		Scanner scanner = new Scanner(System.in);
		String intro = "\n\t [���������� ����] \n\n" + "\t 1. ����\n" + "\t 2. ����\n" + "\t 3. ��\n" + "\t >>>";
		
		System.out.print(intro);

		user = scanner.nextInt();
		com = (int)(Math.random() * 3) + 1;
		
		System.out.println("\n\t �����" + user +"�Դϴ�.");
		System.out.println("\t ���� " + com + "�Դϴ�.");
		
		switch(user - com) {
		
			case 2: case -1:
				System.out.println("\t ����� �����ϴ�.");
			case 1: case -2:
				System.out.println("\t ����� �̰���ϴ�.");
		}
		/*
		 * String tmp = scanner.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� ���� user =
		 * Integer.parseInt(tmp); // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
		 * 
		 * com = (int)(Math.random() * 3) + 1; // 1,2,3�� �ϳ��� com�� �����
		 * 
		 * System.out.println("����� "+ user +"�Դϴ�."); System.out.println("����  "+ com
		 * +"�Դϴ�.");
		 * 
		 * switch(user-com) { case 2: case -1: System.out.println("����� �����ϴ�."); break;
		 * case 1: case -2: System.out.println("����� �̰���ϴ�."); break; case 0:
		 * System.out.println("�����ϴ�."); // break; // ������ �����̹Ƿ� break�� ����� �ʿ䰡 ����. }
		 */
	} // main�� ��
}
