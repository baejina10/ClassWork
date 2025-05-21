package example;

public class Main {
	public static void main(String[] args) {
		//1. 정수를 전달받아 해당 수가 짝수인지 홀수인지 출력하는 메서드를 정의하고 호출하세요.
		MethodHomeTest obj = new MethodHomeTest();
		obj.checkEvenOrOdd(10);
		System.out.println("**********************************");
		obj.sumBetween(1, 100); 
		System.out.println("**********************************");
		obj.repeatString("java", 3);
		System.out.println("**********************************");
		obj.checkAlphabet('A');
		obj.checkAlphabet('9');
		System.out.println("**********************************");
		obj.checkRange(50);   // 정상 입력
		obj.checkRange(150);  // 잘못된 입력
	}

}
