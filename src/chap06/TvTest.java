package chap06;

class Tv{
	String color;
	boolean power;
	int channel;
	
	void setPower() {
		power = !power;
	}
	
	void channelUp( ) {
		channel ++;
	}
	
	void channelDown() {
		channel --;
	}
}

public class TvTest {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		
		System.out.println("tv.color: " + tv.color);
		System.out.println("tv.power: " + tv.power);
		System.out.println("tv.channel: " + tv.channel);
		
		tv.color = "black";
		tv.power = true;
		tv.channel = 9;
		
		System.out.println("tv.color: " + tv.color);
		System.out.println("tv.power: " + tv.power);
		System.out.println("tv.channel: " + tv.channel);
		
		tv.channelUp();
		tv.channelDown();
		
		tv.setPower();
		
		System.out.println("tv.color: " + tv.color);
		System.out.println("tv.power: " + tv.power);
		System.out.println("tv.channel: " + tv.channel);
	}

}
