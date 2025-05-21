package oop.basic.chap05;

public class PersonTest2 {

	public static void main(String[] args) {
		Person2 obj = new Person2();
		obj.setName("RM");
		obj.setAddr("서울");
		obj.setAge(31);
		
		System.out.println("성명:"+obj.getName());
		System.out.println("주소:"+obj.getAddr());
		System.out.println("나이:"+obj.getAge());
	}

}
