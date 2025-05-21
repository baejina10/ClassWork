package oop.basic.chap05.constructor;

public class Rectangle2 {
	private int width; //가로길이
	private int length; //세로길이
	private String color;
	
	//기본생성자
	public Rectangle2() {
		
	}
	//gertter과 setter 메소드
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//직사각형 넓이를 구하는 area 메소드
	/*
	public int area() {
		int getArea = width*length;
		return getArea;
	}
	*/
	public int area() {
		return width*length;
	}
	//둘레를 구하는 perimeter 메소드
	/*
	public int perimeter() {
		int getPerimeter = width*2+length*2;
		return getPerimeter;
	}
	*/
	public int perimeter() {
		return (width+length)*2;
	}

}
