package algorithm.basic;
//시간복잡도테스트 - 빅오표기법

import java.util.Scanner;

public class SearchNumber {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int[] numArr = {20,40,60,70,90};
		System.out.print("숫자입력:");
		int searchNum = key.nextInt();
		
		//searchNum을 찾는 코드를 구현하세요
		//[출력형식]
		//숫자입력:
		//__회 찾기 성공
		
		for(int i=0;i<numArr.length;i++) {
			if(numArr[i]==searchNum) {
				System.out.println((i+1)+"회 찾기 성공!!");
			}
		}
	}

}
