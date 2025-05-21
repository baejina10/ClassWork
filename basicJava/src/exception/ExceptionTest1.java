package exception;

import java.io.FileReader;
import java.io.IOException;
import java.net.Socket;
import java.sql.DriverManager;
import java.util.Scanner;

//개발시점에 발생할 수 있는 예외의 종류들
public class ExceptionTest1 {

	public static void main(String[] args) throws IOException {
		//1. 개발자가 실수할 수 있는 부분
		System.out.println("*************프로그램시작**************");
		int[] myarr = new int[3]; // index : 0 ~ length-1
		//System.out.println(myarr[3]); //ArrayIndexOutOfBoundsException
		//System.out.println(10/0); //ArithmeticException
		String str = null; //NullPointerException
		//str.length();
		System.out.println("***프로그램진행중***");
		//2. 외부요인이나 사용자의 실수로 발생할수 있는 Exception
		Scanner key = new Scanner(System.in);
		System.out.println("값입력(숫자입력):");
		int data = key.nextInt(); //InputMismatchException => 숫자를 입력하지 않고 문자로 입력을 해서 오류
		System.out.println("사용자가 입력한 값=>"+data);
		
		//3. API에서 제공되는 메소드를 사용할때 발생하는 오류
		// => 컴파일시점에 예외를 체크하는 경우
		// => 메소드나 생성자 선언부에 XXXException을 throws하는 코드가 있는 것들은 이 메소드를 사용하는 중에
		//    XXXException이 발생할 가능성이 있다는 의미
		//    RuntimeException의 하위 Exception이 아닌 경우 예외 처리를 하도록 문법오류를 발생시킨다
		// => RuntimeException하위이거나 아니거나 예외발생가능성이 있는 메소드를 사용하는 경우 모두 예외처리를 하는 것이 일반적   
		FileReader fr = new FileReader("test.txt");
		System.out.println((char)fr.read());
		System.out.println(Integer.parseInt("1000")+200); //1000200으로 연결연상자가 실행되지 않고 연산실행
		DriverManager.getConnection("");
		Socket sock = new Socket("",5000);
		
	}

}
