package recursion;

import java.util.Scanner;
//n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 재귀알고리즘을 이용해서 작업

public class FibonacciRecursionTest {
	public static int getFibonacci(int num) {
		int result = 0;
		if(num==1 || num==2) {
			result =1;
		} else {
			result = getFibonacci(num-1)+getFibonacci(num-2);
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		int result = getFibonacci(num);
		System.out.println(result);

	}

}
