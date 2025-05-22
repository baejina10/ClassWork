package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bae_1399_ATM_InsertionSort {

	public static void main(String[] args) throws IOException {
		//1. 문자입력하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());//입력 숫자
		String line = br.readLine();
		String[] arr =  line.split(" ");
		int[] numArr = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			numArr[i] = Integer.parseInt(arr[i]);
		}
		//2. 배열을 오름차순으로 정렬
		// Arrays.sort(numArr); => API를 활용한 거, 아래 코드랑 똑같이 결과가 출력된다. 대신 이를 쓰면 원본이 나오지 않는다
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j>0; j--) {
				if (numArr[j] < numArr[j-1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j-1];
					numArr[j-1] = temp;
				} else {
					break;
				}
			}
		}
		//3. 배열합구하기
		int sum = 0;//최종값
		int acc = 0;//누적시간
		for(int i:numArr) {
			acc = acc+i;
			sum = sum+acc;		
		}
		System.out.println(sum);

	}

}
