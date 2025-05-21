package oop.polymorphism.chap07;

public class SMSSender extends Sender {
	int length;
	public SMSSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void send(){
		System.out.println(name+"전송이 완료 - 80자가 넘지 않는 문자열만 가능합니다. ");
	}
}
