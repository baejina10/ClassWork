package oop.basic.chap05.constructor;

public class PersonTest2 {

	public static void main(String[] args) {
		
		Person2 obj = new Person2("RM","서울",31);
		
		System.out.println("성명:"+obj.getName());
		System.out.println("주소:"+obj.getAddr());
		System.out.println("나이:"+obj.getAge());
		
	}

}
