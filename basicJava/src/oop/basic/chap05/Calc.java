package oop.basic.chap05;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("***********미니계산기***********");
		System.out.println("1.더하기");
		System.out.println("2.곱하기");
		System.out.println("3.빼기");
		System.out.println("4.나누기");
		System.out.print("연산자를 선택하세요.");
		int opr = key.nextInt();
		
		if(opr>=1 & opr<=4) {
			System.out.print("숫자를 입력하세요");
			int num1 = key.nextInt();
			int num2 = key.nextInt();
			//연산결과를 저장할 변수 선언하기
			//메소드를 호출해서 사용하기
			MyMethodDemo obj = new MyMethodDemo();
			int result = obj.calc(opr, num1, num2);
			
			System.out.println("계산결과=>"+result);
		}else {
			System.out.println("연산자를 잘못 선택했습니다.");
		}
	}
}
