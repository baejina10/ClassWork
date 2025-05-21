package chap02;
//기본형변수의 리터럴 확인
public class PrimitiveTypeVariableTest {

	public static void main(String[] args) {
		//사용자가 입력하는 값을 리터럴이라 한다.
		//정수형
		//정수형리터럴은 기본타입이 int
		//int i = 10
		//   ---  ---
		//   변수   리터럴
		//byte b = 128; => byte로 표현할 수 있는 범위가 벗어남
		byte b = 127;
		short s = 32767;
		int i = 2147483647;
		long l = 2147483647L;//int범위를 벗어나면 iong으로 정의해야 한다.
		                     //L이나 l을 추가해서 long형의 리터럴로 변경
		System.out.println(b);
		
		//[실수형]
		//실수형 리터럴의 기본타입은 double
		float f = 10.5f;//float형 리터럴은 f나 F를 추가해서 변경
		double d = 10.5;
		
		int data = 10;
		//int와 int의 연산은 결과도 int
		//double형의 변수에 할당되므로 double유형으로 리터럴이 변경
		double result = data/3;
				
		//System.out.println(date/3);
		System.out.println(result);
		//연산에 포함된 값이 double로 변경되면 모슨 연산은 double연산이 된다.
		System.out.println((double)35/100);
		
		//[문자형]
		//char는 문자를 저장하기 위한 데이터타입
		//리터럴은 작음따옴표로 표현
		char c = 'a';
		char c2 = '한';
		System.out.println(c);
		
		//char의 타입을 int형으로 변환이 가능
		//int = char
		int chardata = 'c';
		//변수 c에 담긴 'a'는 char타입이지만 c변수를 int형으로 강제 형변함
		System.out.println((int)c);
		System.out.println((int)'z');
		System.out.println((int)'A');
		System.out.println((int)'Z');
		
		//[boolean]
		//예/아니오, on/off
		//boolean리터럴은 treu/false
		boolean bool = true;
		System.out.println(bool);

				
	}

}
