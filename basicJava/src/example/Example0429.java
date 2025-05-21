package example;

import java.util.Scanner;

public class Example0429 {

	public static void main(String[] args) {
		//1번 문제
		System.out.println("1번 문제---------------------");
		Scanner key = new Scanner(System.in);
		System.out.print("2~100 사이의 정수를 입력하세요. :");
		int num = key.nextInt();
				
		if(num%2==0&num!=2) {
			System.out.println(num+"는(은) 소수가 아닙니다.");
		} else if(num%3==0&num!=3) {
			System.out.println(num+"는(은) 소수가 아닙니다.");
		} else if(num%5==0&num!=5) {
			System.out.println(num+"는(은) 소수가 아닙니다.");
		} else if(num%7==0&num!=7) {
			System.out.println(num+"는(은) 소수가 아닙니다.");
		} else {
			System.out.println(num+"는(은) 소수입니다.");
		}
				
		//2번 문제
		System.out.println("2번 문제---------------------");
		
		System.out.println("1보다 크고 20보다 작은 정수를 입력하세요.:");
		int num2 = key.nextInt();
		if(num2>=2 & num2<=9) {
			for(int i=1;i<=9;i++) {
				System.out.println(num2+"*"+i+"="+(num2*i));
			}
		} else {
			System.out.println("잘못된 숫자가 입력되었습니다.");
		}

	}

}
