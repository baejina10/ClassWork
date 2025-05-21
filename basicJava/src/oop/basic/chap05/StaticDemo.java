package oop.basic.chap05;
//인스턴수변수와 정적변수(클래스변수 - static변수)
public class StaticDemo {
	int num;//일반변수
	static int staticNum;//static변수
	public StaticDemo() {
		num++;
		staticNum++;
	}
	public void display() {
		System.out.println("num=>"+num+",staticNum=>"+staticNum);
	}

}
