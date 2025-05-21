package chap04;

import java.util.Scanner;

//Switch구문테스트
//=>if~else if~else if~....else로 표현되는 식 중 값을 가지고 평가하는 경우에만 대체할 수 있다.
public class SwitchTest1 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("단:");
		int dan = key.nextInt();
		//switch의()안에는 평가할 수 있는 값이 저장된 변수나, 값을 리턴하는 연산식,
		//값을 리턴하는 메소드로출문 즉, 판단할 값을 리턴하는 변수,식,메소드를 정의
		
		//switch문은 조건을 판단해서 일치하는 case문을 만나면 case문 아래 모든 case문을
		//실행 => 해당 case문만 실행되도록 하려면 각 case문에 case문을 빠져나오도록 break를 추가
		switch(dan) {
		case 2:
			System.out.println("2단");
			break; //break가 정의된 블럭을 빠져나온다.
		case 3:
			System.out.println("3단");
			break;
		case 4:
			System.out.println("4단");
			break;
		default:
			System.out.println("기타");
			
		}
		

	}

}
