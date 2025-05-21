package example;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		System.out.println("******미니계산기*******");
		System.out.println("1.더하기");
		System.out.println("2.곱하기");
		System.out.println("3.빼기");
		System.out.println("4.나누기");
		Scanner key = new Scanner(System.in);
		System.out.print("연사자를 선택하세요.");
		int op = key.nextInt();
		System.out.print("숫자를 입력하세요");
		int num = key.nextInt();
		int num2 = key.nextInt();
		//if문을 이용하기
		if(op==1) {
			System.out.println("계산결과=>"+(num+num2));
		} else if(op==2) {
			System.out.println("계산결과=>"+(num*num2));
		} else if(op==3) {
			System.out.println("계산결과=>"+(num-num2));
		} else if(op==4) {
			System.out.println("계산결과=>"+(num/num2));
		}

	}

}
