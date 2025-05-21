package oop.inheritance.chap07;
/*
 * <<상속관계에서 생성자가 갖는 특징>>
 * 1. 자바로 만들어지는 모든 클래스의 최상위 클래스는 java.lang.Object클래스이다.
 *    => 자바에서는 객체가 갖고 있는 공통의 특징을 java.lang.Object클래스에 정의해 놓고 상속하는 클래스가 
 *      따로 없는 경우 컴파일러를 통해서 자동으로 상속받도록 하고 있다.
 * 2. 개발자가 명시적으로 생성자 호출문을 정의하지 않는 경우 모든 생성자의 첫 번째 문장에는 부모의 기본생성자를 호출하는
 *    명령문이 생략되어 있다.
 *    => 상위클래스에 정의된 기능을 하위클래스에서 사용할 수 있도록 하려면 상위클래스도 메모리에 할당되어야 한다.
 *    => super()를 컴파일러가 추가해 주어 자동으로 부모객체를 생성하도록 기본으로 설정
 * 3. 보통 자바에서 상위클래스를 이용해서 객체생성을 하지 않고 하위클래스로 객체를 생성해서 사용하는 것이 일반적이다.
 *    => 상위클래스는 일반적인 내용을 담고 있는 클래스로 완성되지 않은 내용일 수 있으므로 직겁 생성 못하는 경우가 일반적
 *    => 따라서 하위클래스를 생성할때 상위클래스가 갖고 있는 모든 필드의 값을 전달해서 생성해야 한다.
 *    => 하위클래스생성자 내부에서 부모객체가 생성될때 필요한 부모의 멤버필드가 셋팅되도록 처리한다.
 *    
 *    super(매개변수1, 매개번수2,...)
 *    
 */
class SuperA extends Object{
	String name;
	int age;
	public SuperA() {
		
	}
	public SuperA(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("부모클래스의 생성자");
	}
	
}

class SubA extends SuperA{
	String subdata;
	//상위에서 필요로 하는 모든 필드에 값을 하위클래스에서 전달받도록 생성자를 정의해야 한다.
	//super(...)를 이용해서 부모의 생성자를 명시적으로 호출해야 한다.
	public SubA(String name, int age, String subdata) {
		super(name,age);
//		this.name = name;
//		this.age = age;
		this.subdata = subdata;
	}
}
public class InheritanceTest3 {
	public static void main(String[] args) {
		SubA obj = new SubA("석진",30,"멋지다");
		System.out.println("성명:"+obj.name+",나이:"+obj.age+",정보:"+obj.subdata);
		
	}

}
