package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_1427_SelectionSort {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] arr = line.split("");
		int size =  arr.length;
		int[] numArr = new int[size];
		
		for(int i=0;i<size;i++) {
			numArr[i] = Integer.parseInt(arr[i]);
			//numArr[i] = Integer.parseInt(line.charAt(i)+""); -> String[] arr = line.split(""); 이거 안하고 그냥 한번에 하는 방법도 있다.
		}
		//System.out.println(Arrays.toString(numArr));
		for(int i=0;i<size;i++) {
			int max = i;
			for(int j=i+1;j<size;j++) {
				if(numArr[max]<numArr[j]) {
					max=j;
				}
			}
			int temp = numArr[i];
			numArr[i] = numArr[max];
			numArr[max] = temp;
		}
		StringBuilder sb = new StringBuilder();
		for(int data:numArr) {
			sb.append(data);
		}
		System.out.println(sb);
		
	}

}
