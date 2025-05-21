package chap04;

import java.util.Scanner;

//IfExam01과 동일한 작업을 수행
//양수인 경우에만 평가할 수 있도록 작업
public class IfExam02 {

	public static void main(String[] args) {
		//scanner를 이용해서 작업하기
		Scanner key = new Scanner(System.in); //scanner 클래스를 heap에 가져와 stack?에 scanner와 연결하는 '참조타입' 명령어
		System.out.print("숫자입력:");
		int num = key.nextInt();
		
		
		//답
		if(num>0) {
			if(num%5 == 0) {
				System.out.println("입력한 숫자는 5의 배수입니다.");
			} else {
				System.out.println("입력한 숫자는 5의 배수가 아닙니다.");
			}
		}
		
		/*
		//조건평가
		if(num%5 == 0 & num>0) {
			System.out.println("입력한 숫자는 5의 배수입니다.");
		} else {
			if(num>0) {
				System.out.println("입력한 숫자는 5의 배수가 아닙니다.");
			} else {
				System.out.println("음수라 평가할 수 없음");
			}
		} */
	}

}
