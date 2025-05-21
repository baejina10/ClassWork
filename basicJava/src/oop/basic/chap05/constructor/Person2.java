package oop.basic.chap05.constructor;

public class Person2 {
	
	private String name;
	private String addr;
	private int age;
	public Person2() {
		
	}
	public Person2(String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
