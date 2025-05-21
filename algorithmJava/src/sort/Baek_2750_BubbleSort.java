package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2750_BubbleSort {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());//배열 길이 변수
		
		//입력한 숫자 배열에 넣기
		int[] arr = new int[count];
		for(int i=0;i<count;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		//버블정렬 하는 코드
		for(int i=0;i<count-1;i++) {
			for(int j=0;j<count-1-i;j++) {
				if(arr[j]>arr[j+1]) {//조건에 맞으면 스왑
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		StringBuilder sb = new StringBuilder();//출력할때 시간을 줄이기 위해 사용!
		for(int data : arr) {
			sb.append(data+"\n");
		}
		System.out.println(sb);
	}

}
