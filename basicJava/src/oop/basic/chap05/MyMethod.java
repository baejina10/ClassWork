package oop.basic.chap05;
//메소드를 유형별로 정의
public class MyMethod {
	//4. 매개변수, 리턴값이 모두 있는 메소드
	//=> 숫자2개(정수)를 매개변수로 전달 받아서 더한 후 결과를 리턴하는 메소드
	//=> 메소드 선언부에 리턴타입으로 정의되는 타입과 무조건 동일한 타입의 값
	//   혹은 값이 저장된 변수를 리턴해야 한다.
	//=> 리턴은 메소드의 마지막 명령문에서 return키워드와 함께 리턴한다.
	//=> 리턴하는 값은 무조건 한 개만 리턴할 수 있다.
	public int add(int num1,int num2) {
		int result = 0;
		result = num1 + num2;
		return result;
	}

	//3. 리턴값이 없고 매개변수가 2개인 메소드
	//=> 출력할 기호와 출력할 횟수를 전달 받아서 사용할 수 있도록 메소드를 정의
	public void display(String str,int num) {
		for(int i=1;i<=num;i++) {
			System.out.print(str);
		}
		System.out.println();
		System.out.println("--------------------------");
	}
	//2. 리턴값이 없고 매개변수가 1개인 메소드
	// => 매개변수갯수, 타입, 순서를 다르게 정의하면 같은 이름의 메소드를 여러 개 정의하고
	//    사용할 수 있다. 이를 메소드 오버로딩이라 한다.
	public void display(String str) {
		for(int i=1;i<=10;i++) {
			System.out.print(str);
		}
		System.out.println();
		System.out.println("--------------------------");
	}
	
	//1. 매개변수가 없고 리턴값이 없는 메소드
	// => * 기호를 10회 출력하고 싶은 개발자만 활용 가능
	public void display() {
		for(int i=1;i<=10;i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("--------------------------");
	}
	
}
