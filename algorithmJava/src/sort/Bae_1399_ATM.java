package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//선택정렬?
public class Bae_1399_ATM {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());//입력 숫자
		String line = br.readLine();
		String[] arr =  line.split(" ");
		int[] numArr = new int[count];
		
		for(int i=0;i<count;i++) {
			numArr[i] = Integer.parseInt(arr[i]);
		}
		
		for(int i=0;i<count;i++) {
			int minIdx = i;
			for(int j=i+1;j<count;j++) {
				if(numArr[minIdx]>numArr[j]) {
					minIdx =j;
				}
			}
			int temp = numArr[i];
			numArr[i] = numArr[minIdx];
			numArr[minIdx] = temp;
		}
		System.out.println(Arrays.toString(numArr));
		// 더하는 값 구하기
		
	}

}
