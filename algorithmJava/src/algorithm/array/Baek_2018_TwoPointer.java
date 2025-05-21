package algorithm.array;

import java.util.Scanner;

public class Baek_2018_TwoPointer {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();//기준값
		int startPoint = 1; //시작점
		int endPoint = 1; // 종료포인터
		int count = 1; //가지수를 체크하는 변수, 기준값이 포함되어 있으므로(연속된 자리수의 값을 더해서 num이 된다고 했을때 
		               //                                     값 1개도 하나의 case가 될 수 있으므로)
		int sum = 1;
		
		
		while(endPoint!=num) { //endPoint가 num이 아닌 동안 작업
			if(sum<num) {//구간의 합이 입력 받은 숫자 num보다 작은 경우
				endPoint++;
				sum = sum + endPoint;
			} else if(sum==num){//구간의 합이 입력 받은 숫자가 num과 같은 경우
				count++;
				endPoint++;
				sum = sum + endPoint;
			} else {//구간의 합이 입력 받은 숫자 num보다 큰 경우
				sum = sum - startPoint;
				startPoint++;
			}
			
		}
		System.out.println(count);
		
	}

}
