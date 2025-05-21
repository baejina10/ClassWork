package oop.polymorphism.chap07;
/*
 * 추상클래스
 * => 미완성된 클래스로 객체를 생성할 수 없는 클래스
 *    내용이 구현되어 있지 않은 메소드를 포함하고 있는 클래스를 추상클래스라 한다.
 *    -----------------------
 *       추상메소드(body가 없는 메소드)
 *  1) 추상메소드를 선언하는 방법
 *     접근제어자 abstract 리턴타입 메소드명(매개변수1,매개변수2......);    
 *  2) 추상클래스의 특징
 *     - 추상메소드가 하나라도 정의되어 있으면 추상클래스가 된다.
 *     - 추상클래스는 반드시 클래스 선언부에 abstract을 추가해야 한다.    
 *     - 추상클래스에는 추상메소드와 일반메소드를 정의할 수 있다.
 *     - 추상클래스를 상속 받는 클래스는 extends하면 문법오류가 발생
 *       => SubA가 SuperA를 상속하면 SuperA의 모든 멤버가 SubA의 소유가 된다.
 *          일반메소드도 상속받지만 추상메소드도 상속받으면서 추상메소드인 display가 상속된다.
 *          따라서 SubA도 추상클래스가 된다.
 *          
 *       [문법오류해결방법]
 *       - SubA를 정의하는 선언부에 abstract을 추가
 *       - SubA가 상속받은 추상메소드를 구현해서 내용을 정의한다
 *                     -------------
 *                        오버라이딩
 *       - 추상클래스는 완성되지 않은 클래스이므로 객체를 생성할 수 없다.                 
 */
abstract class SuperA{
	public void test() {
		System.out.println("test");
	}
	public abstract void display(String data);
}
class SubA extends SuperA{
	//어노테이션
	//컴파일러에게 정보를 알려준다.
	//@Override 는 컴파일러에게 이 메소드는 오버라이딩된 메소드라는 것을 알려주는 기호
	@Override
	public void display(String data) {
		System.out.println("부모에게 상속받은 추상메소드를 구현한 메소드");
	}
	
}
public class AbstractTest {

	public static void main(String[] args) {
		SubA obj = new SubA();
		obj.display(null);
		SuperA obj2 = new SuperA();

	}

}
