package oop.polymorphism.chap07;
//부모타입의 변수를 선언하면 모든 자식객체를 참조할 수 있다.
abstract class Parent{
	public abstract void test();
}

class Child1 extends Parent{
	public void test() {
		System.out.println("Child1의 test");
	}
}
class Child2 extends Parent{
	public void test() {
		System.out.println("Child2의 test");
	}
}
class Child3 extends Parent{
	public void test() {
		System.out.println("Child3의 test");
	}
}
class Child4 extends Parent{
	public void test() {
		System.out.println("Child4의 토스뱅크");
	}
}

public class RefTypeCastingTest3 {
	public static void main(String[] args) {
		Child1 obj1 = new Child1();//계좌이체
		Child2 obj2 = new Child2();//신용카드
		Child3 obj3 = new Child3();//카카오페이
		Child4 obj4 = new Child4();
		Parent obj5 = new Child1();
		//Parent obj6 = new Parent();
		Super obj7 = new Sub();
		
		run(obj4);
//		if(obj1 instanceof Parent) {
//			System.out.println("Parent클래스타입");
//		} else {
//			System.out.println("Parent클래스타입이 아닙니다");
//		}
		if(obj1 instanceof Parent) {
			System.out.println("Parent클래스타입");
		}else {
			System.out.println("Parent클래스타입이아니다");
		}
	}
	public static void run(Parent Child) {
		Child.test();
		
	}
	

}
