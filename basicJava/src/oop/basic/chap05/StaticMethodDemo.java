package oop.basic.chap05;
//static메소드와 non-static메소드의 차이점과 사용법
public class StaticMethodDemo {
	public StaticMethodDemo() {
		System.out.println("StaticMethodDemo생성");
	}
	public static void print() { //정적메소드
		System.out.println("+++++++++++print++++++++++");
		//1. static메소드에서 static메소드를 호출
		display();
	}
	public static void display() { //정적메소드
		System.out.println("+++++++++++display++++++++++");
		//4. static메소드에서 non-static메소드를 호출
		//=> 에러발생
		//같은 클래스에서 정의된 메소드라고 하더라도 static에서 non-static을 호출하는 경우 객체생성을 해서 접근
		StaticMethodDemo obj = new StaticMethodDemo();
		obj.test();
	}
	public void test() { //인스턴스메소드
		System.out.println("+++++++++++test++++++++++");
	}
	public static void show() { //정적메소드
		System.out.println("+++++++++++show++++++++++");
	}
	public void change() { //인스턴스메소드
		System.out.println("+++++++++++change++++++++++");
		//2. non-static메소드에서 non-static메소드를 호출하는 경우
		//=> 일반적인 방법으로 메소드 호출
		this.test();
		//3. non-static메소드에서 static메소드를 호출
		//=> 일반적인 방법으로 메소드를 호출
		show();
	}
}
 