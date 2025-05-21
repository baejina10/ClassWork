package chap04;

import java.util.Scanner;

//num변수를 int형으로 선언하고 -100부터 100사이의 임의의 값을 할당합니다.
//입력된 값을 평가하여 양수이면서 짝수, 양수이면서 홀수, 음수를 각각 출력하세요.
public class IfExam03 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("숫자입력:");
		int num = key.nextInt();
		
		//답
		if(num>0) {
			if(num%2==0) {
				System.out.println("양수이면서 짝수");
			} else {
				System.out.println("양수이면서 홀수");
			}
		} else {
			if(num%2==0) {
				System.out.println("음수이면서 짝수");
			} else {
				System.out.println("음수이면서 홀수");
			}
		}
	
		
		/*
		if(num>0 & num%2==0) {
			System.out.println("양수이면서 짝수");
		} else {
			if(num%2!=0) {
				System.out.println("양수이면서 홀수");
			} else {
				System.out.println("음수");
			}
		} */

	}

}
