package oop.polymorphism.chap07;

public abstract class Beverage {
	//필드
	private String name;
	protected int price;
	//생성자
	public Beverage(){//기본생성자
		
	}

	public Beverage(String name) {
		this.name = name;
	}
	//메소드
	public abstract void calcPrice();
	public void print() {
			System.out.println("판매 음료는 "+name+"이며, 가격은 "+price);
		
	}
	//get,set

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
