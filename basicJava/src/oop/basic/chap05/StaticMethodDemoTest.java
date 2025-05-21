package oop.basic.chap05;

public class StaticMethodDemoTest {

	public static void main(String[] args) {
		StaticMethodDemo obj =
				new StaticMethodDemo();
		StaticMethodDemo.print();
		obj.change();
		
		
		//API에서 제공하는 클래스의 static멤버들을 접근하는 방법
		System.out.println("PI값: "+Math.PI);
		System.out.println("랜덤값: "+Math.random());
		test2();
		//test();
	}
	
	public void test() {
		System.out.println("test");
	}
	public static void test2() {
		System.out.println("test2");
	}

}
