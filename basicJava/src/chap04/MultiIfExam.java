package chap04;

import java.util.Scanner;

//주민번호의 7번째 값을 입력받아 성별출력

/*[출력형식]
1,3을 입력하는 경우
주민번호입력:______
남자

2,4를 입력하는 겨우
주민번호입력:_______
여자

이외의 값을 입력하는 경우
주민번호입력:___
기타

*/
public class MultiIfExam {

	public static void main(String[] args) {
		//주민번호결과값
		Scanner key = new Scanner(System.in);
		System.out.print("주민번호입력:");
		int val = key.nextInt();
		
		if(val==1 | val==3) {
			System.out.println("남자");
		} else if(val==2 | val==4) {
			System.out.println("여자");
		} else {
			System.out.println("기타");
		}
		
		//주민번호 입력해서 하기
		/*
		String str = new String("1234567891012");
		char ssn = str.charAt(7);
		*/
	}	
}
