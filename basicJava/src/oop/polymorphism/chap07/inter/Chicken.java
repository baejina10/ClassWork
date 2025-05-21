package oop.polymorphism.chap07.inter;

public class Chicken extends Animal implements Cheatable {
	//생성자
	public Chicken() {
		
	}
	public Chicken (int speed) {
		super(speed);
	}

	@Override
	public void run(int hours) {
		distance = distance + speed*hours; // 호출될 때마다 누적되어 distance 변수에 저장
		
	}

	@Override
	public void fly() {
		speed = speed*2;
	}

}
