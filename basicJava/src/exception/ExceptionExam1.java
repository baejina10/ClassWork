package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//예외처리 구문연습
//사용자가 정수를입력하면 입력값이 정상적으로 출력되고
//문자를 입력하면 "잘못입력했습니다" 메시지가 출력될 수 있도록 수정
public class ExceptionExam1 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		try {
			System.out.println("숫자입력:");
			int data = key.nextInt();
			System.out.println("입력값:"+data);
		} catch(InputMismatchException e) {
			System.out.println("잘못입력했습니다.");
		}

	}

}
