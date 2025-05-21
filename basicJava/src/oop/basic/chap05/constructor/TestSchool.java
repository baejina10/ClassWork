package oop.basic.chap05.constructor;


public class TestSchool {
	public static void main(String[] args) {
		
		Student s = new Student("김석진",31,202001);
	
		Teacher t = new Teacher ("김남준",30,"java");
	
		Staff e = new Staff("전정국",25,"작곡과");
	
		s.display();
		t.display();
		e.display();
	}

}
