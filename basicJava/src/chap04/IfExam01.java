package chap04;
import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
		//랜덤수발생
		/*Random str = new Random();
		int num = str.nextInt();
		System.out.println("num =>"+num);*/
		//스캐너를 이용해서 작업하세요.
		Scanner key = new Scanner(System.in);
		System.out.println("숫자입력:");
		int num = key.nextInt();
		
		//조건평가
		if(num%5 == 0) {
			System.out.println("입력한 숫자는 5의 배수입니다.");
		} else {
			System.out.println("입력한 숫자는 5의 배수가 아닙니다.");
		}
	}
}
