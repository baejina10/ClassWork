package oop.basic.chap05;
//자바의 특징에 맞게 클래스를 정의
//클래스를 정의할때 멤버변수는 private으로 선언해서 외부에서 접근할 수 없도록 정보를 은닉해야 한다.
//외부에서 접근할 수 없으므로 필요한 경우 public 메소드를 통해서 접근할 수 있도록 정의해야한다.
public class Person2 {
	//정보를 은닉
	private String name;
	private String addr;
	private int age;
	
	//모든 멤버변수가 private으로 선언되어 있으므로 메소드를 정의해서 
	//엑세스를 할 수 있독록 메소드를 구현
	//멤버변수의 값을 설정하기 위한 메소드 : setter메소드
	//메소드명 : set + 값이 저장될 멤버변수의 첫 글자를 대문자로 변경해서 연결
	//ex) name변수에 값을 설정하기 위한 메소드
	//setName
	public void setName(String name) {
		this.name = name;
	}
	//setAddr
	public void setAddr(String addr) {
		this.addr = addr;
	}
	//setAge
	public void setAge(int age) {
		this.age = age;
	}
	
	//객체의 멤버변수에 저장된 값을 호출한 곳으로 넘겨줄 메소드 정의(getter메소드)
	//메소드명:get+값이 저장될 멤버변수의 첫 글자를 대문자로 변경해서 연결
	//ex) name변수의 값을 가져올 수 있도록 메소드정의
	//    getName
	public String getName() {
		return this.name;
	}
	public String getAddr() {
		return this.addr;
	}
	public int getAge() {
		return this.age;
	}
}
