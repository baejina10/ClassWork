package chap04;

import java.util.Scanner;

/*MultiIfExam2.java

다중if, if문을 중첩

0 ~ 59 : F학점
60 ~ 69 : D학점
70 ~ 79 : C학점
80 ~ 89 : B학점
90 ~ 100 : A학점
110 or -40 : 잘못입력


[출력형식]
점수:_, 
학점:_

1) Scanner클래스를 이용해서 입력받도록 
2) 0부터 100까지 입력되면 학점평가, 외의 숫자는 잘못입력으로 출력되도록 구현 
*/

public class MultiIfExam2 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("점수:");
		
		//내가 한 방법
		/*
		int num = key.nextInt();
		
		if(num>100 | num<0) {
			System.out.println("잘못입력");
		} else {
			if(num<60) {
				System.out.println("학점:F학점");
			} else if(num<70) {
				System.out.println("학점:D학점");
			} else if(num<80) {
				System.out.println("학점:C학점");
			} else if(num<90) {
				System.out.println("학점:B학점");
			} else {
				System.out.println("학점:A학점");
			}
		}
		*/
		//강사님이 한 방법
		int jumsu = key.nextInt();
		String score = "";
		if(jumsu>=0 & jumsu<=100) {
			if(jumsu>=90) {
				score = "A학점";
			} else if (jumsu>=80) {
				score ="B학점";
			} else if (jumsu>=70) {
				score ="C학점";
			} else if (jumsu>=60) {
				score ="D학점";
			} else {
				score ="F학점";
			}
			System.out.println("점수:"+jumsu+"\n평가:"+score);
		} else {
			System.out.println("잘못입력");
		}
		
	}

}
