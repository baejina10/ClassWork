package prob;

public class Duck {
	public Duck() {
		
	}
	//필드멤버
	private String name;
	private int legs;
	private int length;
	
	
	//메소드
	public void setName(String name) {
		this.name = name;
	}
	public void fly() {
		System.out.println("오리("+name+")는 날지않습니다.");
	}
	public void sing() {
		System.out.println("오리("+name+")가 소리내어 웁니다.");
	}
	public String toString() {
		String str="오리의 이름은 "+name+" 입니다.";
		return str;
	}
	
}
