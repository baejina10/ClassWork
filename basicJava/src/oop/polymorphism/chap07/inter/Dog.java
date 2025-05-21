package oop.polymorphism.chap07.inter;

public class Dog extends Animal {
	//생성자
	public Dog() {
		
	}
	public Dog(int speed) {
		super(speed);
	}

	@Override
	public void run(int hours) {
		distance = distance + speed*hours*0.5; // 호출될 때마다 누적되어 distance 변수에 저장
//		          ----------
//                 누적되어야 해서 distance를 더해야한다.		
	}

}
