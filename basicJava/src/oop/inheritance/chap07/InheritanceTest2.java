package oop.inheritance.chap07;
/*
 * <<상속관계에서 메소드가 갖는 특징>>
 * 1. 상위클래스에서 정의된 메소드를 하위클래스에서 호출할 수 있다.
 *    => 하위클래스 타입의 참조변수를 통해서 상위클래스의 메소드를 사용할 수 있다.
 * 2. 상위클래스에 정의된 메소드와 동일한 메소드를 하위클래스에서 정의하면 하위클래스의 메소드가 우선으로 실행된다
 *    => 부모클래스의 메소드와 리턴타입, 메소드명, 매개변수갯수, 매개변수타입이 모두 동일해야 같다고 인식
 *    => 하위클래스에서 부모클래스에 정의된 메소드를 재정의 하는 개념 즉, 메소드오버라이딩
 *    => 멤버필드는 정적바인딩, 메소드는 동적바인딩   
 * 3. 상위클래스에 정의된 메소드를 호출하려면 super키워드를 이용해서 호출할 수 있다.
 *                                ----------
 *                                일반적인 경우에드 그냥 접근가능
 *                                오버라이딩된 메소드를 호출하는 경우 부모의 메소드를
 *                                호출해야 한다면 super이용해서 호출
 *                                
 */
class Parent{
	public void display() {
		System.out.println("부모의 display");
	}
	
}
class Child extends Parent{
	public void display() {
		System.out.println("하위클래스의 display");
	}
	public void test() {
		System.out.println("자식클래스의 test()");
		super.display();
	}
	
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.display();
		obj.test();
	}

}
