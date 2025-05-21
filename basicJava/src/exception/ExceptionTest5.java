package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//처리해야하는 Exception이 많은 경우
//각각의 예외에 따라서 다르게 처리하고 싶은 경우 다중 catch문을 이용한다.
//=> 다중 catch문을 이용하는 경우 상위클래스에 해당하는 Exception은 제일 아래쪽에 정의한다.
public class ExceptionTest5 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		try {
			System.out.println("시작");
			System.out.println("종료");
			System.out.println("나눌숫자:");
			int num = key.nextInt();
			System.out.println(10/num);
			if(num%2==0) {
				System.out.println(args[0]);
			} else {
				String str = null;
				System.out.println(str.length());
			}
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누면 안돼~~~");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("명령형매개변수없어~~~");
		}catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요~~~");	
		}catch (Exception e) {
			System.out.println("기타예외");	
		} finally {
			System.out.println("무조건실행");
		}
		
		
	}

}
