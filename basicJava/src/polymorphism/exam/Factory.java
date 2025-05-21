package polymorphism.exam;

public abstract class Factory {
	//필드
	int openHour;
	int closeHour;
	String name;
	//생성자
	public Factory() {
		
	}
	public Factory(String name,int openHour,int closeHour) {
		this.name = name;
		this.openHour = openHour;
		this.closeHour = closeHour;
	}
	//메소드
	public int getWorkingTime() {
		int wokingTime = closeHour-openHour;
		return wokingTime;
	}
	public abstract int makeProducts(char skill); //기술력에 따른 하루 제품 생산량
		

	
	//get,set
	public int getOpenHour() {
		return openHour;
	}
	public void setOpenHour(int openHour) {
		this.openHour = openHour;
	}
	public int getCloseHour() {
		return closeHour;
	}
	public void setCloseHour(int closeHour) {
		this.closeHour = closeHour;
	}
	public String getFactoryName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
