package oop.basic.chap05;


public class TestSchool {
	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setName("김석진");
		s.setAge(31);
		s.setId(202001);
		
		Teacher t = new Teacher ();
		
		t.setName("김남준");
		t.setAge(30);
		t.setSubject("JAVA");
		
		Staff e = new Staff();
		
		e.setName("전정국");
		e.setAge(25);
		e.setjob("작곡과");
		
		s.display();
		t.display();
		e.display();
	}

}
