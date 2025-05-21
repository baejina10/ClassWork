package prob;

public class Wheeler { //부모 클래스
	protected int velocity; //속도 변수
	protected String carName;
	protected int wheelNumber;
	public Wheeler() { //기본 생성자
		System.out.println("");
	}

	public Wheeler(int velocity, String carName, int wheelNumber) {
		super();
		this.velocity = velocity;
		this.carName = carName;
		this.wheelNumber = wheelNumber;
	}

	public void speedUp(int speed) { //속도 증가 메소드
		System.out.println("의 현재 속도는 "+speed+ " 입니다.");
	}

	public void speedDown(int speed) { // 속도 감소 메소드
		System.out.println("의 최저속도위반으로 속도를 "+speed+ " 으로 올립니다.");
	}

	public void stop() { // 정지 메소드
		velocity = 0;
		System.out.println("정지상태로 속도를 0으로 초기화합니다.");
	}

	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getWheelNumber() {
		return wheelNumber;
	}

	public void setWheelNumber(int wheelNumber) {
		this.wheelNumber = wheelNumber;
	}
	
}