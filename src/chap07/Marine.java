package chap07;

public class Marine extends Unit{

	Marine(int x, int y){
		super(x, y);
		System.out.println("Marine �ν��Ͻ� ���� !");
	}
	
	void move(int x, int y) {
		System.out.println("Marine �̵� !");
	}
}
