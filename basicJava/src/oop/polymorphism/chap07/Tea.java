package oop.polymorphism.chap07;

public class Tea extends Beverage {
	static int amount;
	//생성자
	public Tea() {
		
	}
	public Tea(String name) {
		super(name);
		this.amount ++; //판매된 tea의 갯수를 누적
		calcPrice();//가격계산 - 판매된 tea의 가격을 계산
	}

	//메소드
	@Override
	public void calcPrice() {
		if(getName().equals("lemonTea")) {
			price = 1500;
		} else if(getName().equals("ginsengTea")){
			price = 2000;
		} else if (getName().equals("redginsengTea")) {
			price = 2500;
		} else {
			price = 0;
		}
		
	}
	//get,set
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
}
