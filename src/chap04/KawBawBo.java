package chap04;

import java.util.Scanner;

public class KawBawBo {

	public static void main(String[] args) {

		int user, com;
		String []kbb = {"����", "����", "��"};
		String result = "";
		boolean isWin = false;
		Scanner scanner = new Scanner(System.in);
		String intro = "\n\t [ ���������� ���� ] \n\n" + "\t 1. ����\n" +"\t 2. ����\n" +"\t 3. ��\n" + "\t >>>" ;
		
		do {
			com = (int)(Math.random() * 3);
			System.out.print(intro);
			user = scanner.nextInt() - 1 ;
			
			System.out.printf("\n\t ����� %s, ��ǻ�� %s %n", kbb[user], kbb[com]);
			
			switch(user - com) {
				case 2: case -1: result = "�����ϴ�"; break;
				case 1: case -2: result = "�̰���ϴ�"; isWin = true; break;
				case 0: result = "�����ϴ�"; break;
			}
			
			System.out.printf("\t ���������� ��� ==> %s %n", result);
			
		}while(!isWin);
		
		scanner.close();
		System.out.println("\n\t �̿����ּż� �����մϴ�. ������ �ٽ� ������ ... ^^\n");

	}

}
