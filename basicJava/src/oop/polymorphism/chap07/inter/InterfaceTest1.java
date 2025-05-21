package oop.polymorphism.chap07.inter;
/*
 * 인터페이스특징
 * => 추상메소드만 정의하는 특별한 클래스
 * => 인터페이스를 정의하고 사용하면 다중상속을 구현할 수 있다.
 *                         --------------------
 *                             다형성을 위한 작업
 * => 무조건 상위타입으로 사용될 특별한 클래스
 * 
 * 1. 인터페이스를 정의하는 경우 class키워드 대신에 interface키워드를 이용해서 정의
 * 2. 인터페이스는 추상메소드만 정의하는 특별한 클래스이므로
 *    - 인터페이스에 정의하는 메소드는 public abstract이 무조건 추가된다고 생각하면 된다.
 *      따라서 생략이 가능하다.
 * 3. 인터페이스가 인터페이스를 상속하는 경우 extends를 이용해서 상속한다.
 *    - 다중상속이 가능하다.
 *    - , 로 구분해서 상속
 * 4. 클래스가 인터페이스를 상속하는 경우 implements 키워드를 이용해서 상속한다. 
 *    - 다중상속이 가능하고 ,로 구분해서 상속     
 * 5. 하나의 클래스가 클래스와 인터페이스를 모두 상속하는 경우
 *    class A extends 클래스 implements 인터페이스1, 인터페이스2...{
 *           --------  
 *             implements보다 먼저 정의되어야 한다.             
 */
interface SuperInterfaceA {
	void show(); // public abstract 생략
}
interface SuperInterfaceB {
	void test();
}
interface ChildInterfaceA extends SuperInterfaceA, SuperInterfaceB {
	
}
class Super {
	public void display() {
		System.out.println("display");
	}
}

class ChildA extends Super implements SuperInterfaceA, SuperInterfaceB {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceTest1 {

	public static void main(String[] args) {
		ChildA child = new ChildA();
		run1(child);
		run2(child);
		run3(child);
	}
	public static void run1(Super obj) {
		obj.display();
	}
	public static void run2(SuperInterfaceA obj) {
		obj.show();
	}
public static void run3(SuperInterfaceB obj) {
		obj.test();
	}
	
	
	
	

}
