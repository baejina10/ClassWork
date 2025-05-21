package oop.basic.chap05;

public class Staff {
	private String name;
	private int age;
	private String job;
	
	public Staff() {
	
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setjob(String job) {
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getJob() {
		return job;
	}
	public void display() {
		System.out.println("이 름 : "+name+"\t나 이 : "+age+"\t부  서: "+job);
	}
}
