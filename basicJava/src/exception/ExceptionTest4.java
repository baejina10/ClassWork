package exception;

import java.util.Scanner;

//반복구문을 사용하는 경우 예외처리 구문이 선언된 위치에 따라 결과가 다르게 실행
public class ExceptionTest4 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int i = 1;
		//예외가 발생되면 반복문이 종료된다.
//		try {
//			while(i<=5) {
//				System.out.println("i="+i);
//				System.out.println("나눌 숫자 입력:");
//				int num = key.nextInt();
//				System.out.println("계산결과=>"+(i/num));
//				i++;
//			}
//		} catch (ArithmeticException e) {
//			System.out.println("계산의 오류가 발생했습니다~~~~");
//		}
		//while문 안에서 예외를 처리
		while(i<=7) {
			System.out.println("i="+i);
			System.out.println("나눌 숫자 입력:");
			int num = key.nextInt();
			
			try {	
				System.out.println("계산결과=>"+(i/num));
			}catch (ArithmeticException e) {
				System.out.println("계산의 오류가 발생했습니다~~~~");
			}
		i++;
		}
	}

}
