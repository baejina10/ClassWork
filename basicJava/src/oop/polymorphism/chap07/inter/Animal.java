package oop.polymorphism.chap07.inter;

public abstract class Animal {
	int speed; //속도
	double distance; //이동거리
	//생성자
	public Animal() {
		
	}

	public Animal(int speed) {
		this.speed = speed;
	}
	
	//메소드
	public abstract void run(int hours);

	//get,set
	public double getDistance() { // 누적된 거리를 호출하면 나타내는 코드
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
	
	
}
