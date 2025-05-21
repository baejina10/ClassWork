package oop.basic.chap05;
//static이 추가된 클래스변수와 일반변수인 인스턴스변수의 값변화
public class StaticDemoTest {

	public static void main(String[] args) {
		StaticDemo obj1 = new StaticDemo();
		System.out.println(obj1);
		obj1.display();
		//객체외부에서 객체의 인스턴스변수와 클래스변수를 접근하는 방법은 다르다.
		//=> 인스턴스변수는 객체(인스턴스)의 소유이므로 객체를 참조하는 변수를 통해서 액세스
		//=> static변수는 특정 인스턴스의 소유가 아니라 클래스정보가(클래스의 메타데이터) 올라오는 곳에 할당되는 변수로
		//   모든 인스턴스가 공유해서 사용하는 변수이므로 어떤 객체의 소유도 아니다
		//   따라서 인스턴스변수로 액세스하지 않고 클래스명으로 액세스
		//   멤버필드 => 클래스명.멤버필드
		//   메소드 => 클래스명.메소드()
		System.out.println("인스턴스변수=>"+obj1.num+",클래스변수=>"+StaticDemo.staticNum);
		
		
		StaticDemo obj2 = new StaticDemo();
		System.out.println(obj2);
		obj2.display();
		System.out.println("인스턴스변수=>"+obj2.num+",클래스변수=>"+StaticDemo.staticNum);
		
		StaticDemo obj3 = new StaticDemo();
		System.out.println(obj3);
		obj3.display();
		System.out.println("인스턴스변수=>"+obj3.num+",클래스변수=>"+StaticDemo.staticNum);
		
		System.out.println("------------------------------------------------------------------");
		obj3.num = 10000;
		StaticDemo.staticNum = 1500;
		
		obj1.display();
		obj2.display();
		obj3.display();

	}

}
