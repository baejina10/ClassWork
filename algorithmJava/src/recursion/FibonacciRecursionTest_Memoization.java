package recursion;

import java.util.Scanner;
//한 번 작업했던(호출했던 메소드 결과) 내용은 배열에 기록해 놓고 사용하기
//- 이미 저장되어 있는 연산은 메소드를 호출하지 않고 배열에 저장된 것을 꺼내서 리턴
public class FibonacciRecursionTest_Memoization {
	static int[] myarr;
	public static int getFibonacci(int num) {
		//이미 저장된 것은 배열에서 꺼내서 리턴하도록 수정
		if(myarr[num]>0) {//0보다 크면 이미 저장된 값이 존재한다는 의미
			return myarr[num];
		}
		//처음 작업인 경우는 배열에 넣기	
		if(num==1 || num==2) {
			return myarr[num] = 1;//myarr[num]의 요소에 1을 넣고 리턴하기
		} else {
			return myarr[num] = getFibonacci(num-1)+getFibonacci(num-2);
		}
	}
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		myarr = new int[num+1];
		int result = getFibonacci(num);
		System.out.println(result);

	}

}
