package chap04;

/**
 * 1���� 100������ ���� 5050�Դϴ�. �׷��ٸ� 1���� ������� ���� ���ʷ� 1000�� �ʰ��ϴ� ���ϱ�� ?
 * ���� ��� > 1���� ? ������ ���� XXXX �Դϴ�. 
 */

class FlowEx26 {
	
	public static void main(String[] args) { 
		
		int sum = 0;
		int i = 1 ;
		
		while(i < 101) {
			sum += i; 
			i++;
			
			if(sum > 1000) { 
				System.out.println("1 ���� " + i + " ������ ���� " + sum + "�Դϴ�. ");
				break;
			}
		}
	} 
}
