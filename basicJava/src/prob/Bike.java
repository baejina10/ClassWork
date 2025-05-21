package prob;

public class Bike extends Wheeler{
	public Bike() {//기본생성자
		
	}

	public Bike( String carName, int velocity, int wheelNumber) {
		super(velocity, carName, wheelNumber);
	}
	public void speedUp(int speed) { //속도 증가 메소드
		velocity = velocity+speed;
		if(velocity>40) {
			velocity = 40;
			System.out.print(carName);
			super.speedUp(velocity);
		} else {
			System.out.print(carName);
			super.speedUp(velocity);
		}
	}

	public void speedDown(int speed) { // 속도 감소 메소드
		velocity = velocity - speed;
		if(velocity<10) {
			velocity = 10;
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
