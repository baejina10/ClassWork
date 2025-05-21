package oop.basic.chap05.constructor;

//color 를 초기화 하지 않을 경우 기본값은 흰색으로 할 것 
public class Rectangle {
	private int width;
	private int height;
	private String color;
	private int area;
	
	public Rectangle() {
		
	}
	//width, height 정보를 초기화 하는 생성자
	public Rectangle(int width,int height) {
		this.width = width;
		this.height = height;
		color = "흰색";
	}
	//width, height, color 정보를 초기화 하는 생성자
	public Rectangle(int width,int height, String color) {
		this(width,height);
		this.color = color;
	}
	// getter/setter  Method를 정의  
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
//면적을 계산하는 Method를 정의 할 것. (Method Name은 Prob.java 참조)
//내가 한거
//	public int calculateArea() {
//		area = width*height;
//		return area;
//	}
//	rectangle02.calculateArea();이 값을 저장하는 변수가 없으니 변수타입이 없어도 됨. 
//	그러니 변수타입에 void로 해도 됨
	
	public void calculateArea() {
		area = width*height;
	}

	
}
