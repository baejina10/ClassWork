package prob;

public class Truck extends Wheeler {
	public Truck() {//기본생성자
		
	}

	public Truck(String carName, int velocity, int wheelNumber) {
		super(velocity, carName, wheelNumber);
	}
	public void speedUp(int speed) { //속도 증가 메소드
		velocity = velocity+5*speed;
		if(velocity>100) {
			velocity = 100;
			System.out.print(carName);
			super.speedUp(velocity);
		} else {
			System.out.print(carName);
			super.speedUp(velocity);
		}
	
	}

	public void speedDown(int speed) { // 속도 감소 메소드
		velocity = velocity - 5*speed;
		if(velocity<50) {
			velocity = 50;
			System.out.print(carName);
			super.speedDown(velocity);
		} else {
			System.out.print(carName);
			super.speedDown(velocity);
		}
	}
	public void stop() { // 정지 메소드
		velocity = 0;
		System.out.println("정지상태로 속도를 0으로 초기화합니다.");
	}
	
}
