package chap04;

/**
 * 1부터 100까지의 합은 5050입니다. 그렇다면 1부터 몇까지의 합이 최초로 1000을 초과하는 값일까요 ?
 * 실행 결과 > 1부터 ? 까지의 합은 XXXX 입니다. 
 */

class FlowEx26 {
	
	public static void main(String[] args) { 
		
		int sum = 0;
		int i = 1 ;
		
		while(i < 101) {
			sum += i; 
			i++;
			
			if(sum > 1000) { 
				System.out.println("1 부터 " + i + " 까지의 합은 " + sum + "입니다. ");
				break;
			}
		}
	} 
}
