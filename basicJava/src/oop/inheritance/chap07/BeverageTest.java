package oop.inheritance.chap07;

class Beverage{
	public String type;
	public int price;
	public Beverage() {//기본 생성자
		
	}
	public Beverage(String type, int price) {
		this.type = type;
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
		
	}
	
}

class Coffee extends Beverage{
	public String name;
	
	public Coffee() {//기본생성자
		
	}
	public Coffee(String type, int price,String name) {
		super(type,price);
		this.name = name;
	}
	public void print() {
		System.out.println("타입:"+type+",가격:"+price+",이름:"+name);
	}
}

public class BeverageTest {
	public static void main(String[] args) {
        Coffee obj1 = new Coffee("커피",2500,"아메리카노");
        Coffee obj2 = new Coffee("커피",2700,"카페라뗴");
        Coffee obj3 = new Coffee("커피",300,"카푸치노");
        obj1.print();
        obj2.print();
        obj3.print();
        
        
	}

}
