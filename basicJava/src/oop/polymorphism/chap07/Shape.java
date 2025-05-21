package oop.polymorphism.chap07;

public abstract class Shape {
	protected double area;
	private String name;
	public Shape() {//기본 생성자
		
	}
	public Shape(String name) {
		this.name = name;
	}
	//메소드
	public abstract void calculationArea();
	
	public void print() {
		System.out.println(name+"의 면적은"+area);
	}
	//get,set
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
