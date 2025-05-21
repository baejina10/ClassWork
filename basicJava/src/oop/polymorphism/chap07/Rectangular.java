package oop.polymorphism.chap07;

public class Rectangular extends Shape {
	private double widht;
	private double hight;
	public Rectangular(){
		
	}
	public Rectangular(String name, double widht, double hight) {
		super(name);
		this.widht = widht;
		this.hight = hight;
	}
	@Override
	public void calculationArea() {
		area = widht*hight;
	}
	
	//get,set
	public double getWidht() {
		return widht;
	}
	public void setWidht(double widht) {
		this.widht = widht;
	}
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}

}
