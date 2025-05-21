package chap04;
//switch문의 특징
//=> switch문 내부에서 평가할 수 있는 데이터타입
//=> switch문 내부에서 평가할 수 있는 값은 int로 자동 캐스팅이 되는 타입(byte,short,int,char)
//   이거나 String
//=> case문에는 조건식을 사용할 수 없다.
public class SwitchTest2 {

	public static void main(String[] args) {
		//byte data = 10;
		//short data = 10;
		//int data = 10;
		//long data = 10; ------불가능
		char data = 'A';
		switch(data) {
			case 'A':
			System.out.println("예시1");
			break;
		}
		int data2 = 10;
		switch(data2) {
		 case 10:
			 System.out.println("예시1");
			 break;
		}
		String data3 = "java";
		switch(data3) {
			case "git":
				System.out.println("깃허브");
				break;
			case "java":
				System.out.println("자바");
				break;
		}
		//실수형  -----불가능
		/*
		double d = 10.5;
		switch(d) {
		case 10.5:
			System.out.println("예시1");
			break; */

	}

}
