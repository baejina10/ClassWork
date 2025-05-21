package oop.basic.chap05;

public class Teacher {
	private String name;
	private int age;
	private String subject;
	
	public Teacher() {
	
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getSubject() {
		return subject;
	}
	public void display() {
		System.out.println("이 름 : "+name+"\t나 이 : "+age+"\t담당과목: "+subject);
	}
}
