package example;

import java.util.Scanner;

public class Example0430 {

	public static void main(String[] args) {
		//3. 두 숫자의 최대 공약수를 구하는 프로그램을 작성하십시오.
		//=> 나눠서 둘다 나머지가 0이 나오고 나눌 수 중 제일 큰 숫자
		
		Scanner key = new Scanner(System.in);
		System.out.println("[입력값]");
		int num1 = key.nextInt();
		int num2 = key.nextInt();
		int num3 = key.nextInt();
		int num4 = key.nextInt();
		int num5 = key.nextInt();
		int num6 = key.nextInt();
		
		System.out.println("[실행결과]");
		//최대공약수
		int max1 = 0;
		for(int i=1; i<=num1&i<num2; i++) {
			if(num1%i==0 & num2%i==0) {
				max1=i;
			}
		}
		int max2 = 0;
		for(int i=1; i<=num3&i<num4; i++) {
			if(num3%i==0 & num4%i==0) {
				max2=i;
			}
		}
		int max3 = 0;
		for(int i=1; i<=num5&i<num6; i++) {
			if(num5%i==0 & num6%i==0) {
				max3=i;
			}
		}
		System.out.println(max1);
		System.out.println(max2);
		System.out.println(max3);

	}

}
