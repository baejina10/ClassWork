package example;

import java.util.Scanner;

public class Example0430_Q4 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요: ");
		int num = key.nextInt();
		int numCnt = 0;
		int numSum = 0;
		for(int i=1; i<=1000;i++) {
			if(i%num==0) {
				numCnt++;
				numSum = numSum+i;
			}
		}
		System.out.println(num+"의 배수 개수 = "+numCnt);
		System.out.println(num+"의 배수 합 = "+numSum);
	}

}
