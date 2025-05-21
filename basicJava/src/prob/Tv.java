package prob;

public class Tv {
	private String color;
	private boolean power;
	private int channel;
	
	public Tv() {
		color = "black";
		power = false;
		channel = 0;
	}
	public void power() {
		if(power == true) {
			power = false;
		} else {
			power = true;
		}
	}
	public void channelUp() {
		channel = channel+1;
	}
	public void channelDown() {
		channel = channel-1;
	}
	public void print() {
		System.out.println("color :"+color+"\t power:"+power+"\t channel:"+channel);
	}
	
}
