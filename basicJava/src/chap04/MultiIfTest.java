package chap04;

import java.util.Scanner;

//if~else if~else if~....else
public class MultiIfTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("숫자입력:");
		int num = key.nextInt();
		if(num>0) {
			System.out.println("양수");
		}else if(num<0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
	}

}
