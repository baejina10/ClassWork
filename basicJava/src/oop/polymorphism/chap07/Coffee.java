package oop.polymorphism.chap07;

public class Coffee extends Beverage {
	//필드
	static int amount;
	//생성자
	public Coffee() {
		
	}
	public Coffee(String name) {
		super(name);
		this.amount++;//판매된 coffee의 갯수를 누적
		calcPrice();//가격계산 - 판매된 coffee의 가격을 계산
	}
	//메소드
	@Override
	public void calcPrice() {
		if(getName().equals("Americano")) {
			price = 1500;
		} else if(getName().equals("CafeLatte")){
			price = 2500;
		} else if(getName().equals("Cappuccino")) {
			price = 3000;
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
