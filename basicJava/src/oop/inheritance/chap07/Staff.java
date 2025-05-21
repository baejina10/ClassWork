package oop.inheritance.chap07;

public class Staff extends Person {
	private String job;
	public Staff() {
		
	}
	public Staff(String name,int age, String job) {
		super(name,age);
//		this.name = name;
//		this.age = age;
		this.job = job;
	}
	
	public void setjob(String job) {
		this.job = job;
	}
	public String getJob() {
		return job;
	}
	public void display() {
		super.display();
		System.out.println("\t부  서: "+job);
	}
}
