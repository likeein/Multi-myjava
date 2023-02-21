package chap04;

import java.util.Scanner;

public class KawBawBo {

	public static void main(String[] args) {

		int user, com;
		String []kbb = {"가위", "바위", "보"};
		String result = "";
		boolean isWin = false;
		Scanner scanner = new Scanner(System.in);
		String intro = "\n\t [ 가위바위보 게임 ] \n\n" + "\t 1. 가위\n" +"\t 2. 바위\n" +"\t 3. 보\n" + "\t >>>" ;
		
		do {
			com = (int)(Math.random() * 3);
			System.out.print(intro);
			user = scanner.nextInt() - 1 ;
			
			System.out.printf("\n\t 사용자 %s, 컴퓨터 %s %n", kbb[user], kbb[com]);
			
			switch(user - com) {
				case 2: case -1: result = "졌습니다"; break;
				case 1: case -2: result = "이겼습니다"; isWin = true; break;
				case 0: result = "비겼습니다"; break;
			}
			
			System.out.printf("\t 가위바위보 결과 ==> %s %n", result);
			
		}while(!isWin);
		
		scanner.close();
		System.out.println("\n\t 이용해주셔서 감사합니다. 다음에 다시 만나요 ... ^^\n");

	}

}
