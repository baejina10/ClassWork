package chap04;

import java.util.Scanner;

//scanner로 입력 받은 구구단을 출력하세요
public class ForExam_GuGu {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("단:");
		int num = key.nextInt();
		
		for(int i=1; i<10;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}

	}

}
