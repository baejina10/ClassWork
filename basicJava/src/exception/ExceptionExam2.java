package exception;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * 아래 코드에서는 NullPointerException이 발생하고
 * 사용자가 어떤 값을 입력하냐에 따라 문자를 입력하는 경우 InputMismatchException이 발생합니다.
 * - Exception이 발생하는 경우 각각 메시지가 출력될 수 있도록 코드를 추가하세요.
 * - Exception이 발생하거나 발생하지 않거나 무조건 "완료"라는 메시지가 출력되도록 코드를 추가하세요. 
 */
public class ExceptionExam2 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		try {
			String str = null;	
			System.out.println("숫자입력:");
			int data = key.nextInt();
			System.out.println("입력한 숫자는 :"+data);
			
			System.out.println(str.length());
			} catch(NullPointerException e) {
				System.out.println("명령형매개변수없음");
			} catch (InputMismatchException e) {
				System.out.println("숫자가 아님");
			} catch (Exception e) {
				System.out.println("기타예외");
			} finally {
				System.out.println("완료");
			}
	}

}
