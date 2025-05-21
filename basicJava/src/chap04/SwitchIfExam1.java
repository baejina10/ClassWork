package chap04;

import java.util.Scanner;

public class SwitchIfExam1 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("주민번호입력:");
		int val = key.nextInt();
		String ex = "";
		//반복적인 결과가 나올때
		switch(val) {
			case 1:
			case 3:
				ex ="남자";
				break;
			case 2,4:
				ex ="여자";
				break;
			default :
				ex ="기타";
		}
		System.out.println("성별은:"+ex);
		
		/* 기존 방법
		 * switch(val) {
			case 1:
				ex ="남자";
				break;
			case 3:
				ex ="남자";
				break;
			case 2:
				ex ="여자";
				break;
			case 4:
				ex ="여자";
				break;
			default :
				ex ="기타";
		}
		System.out.println("성별은:"+ex);
		 */
	}

}
