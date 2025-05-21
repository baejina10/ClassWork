package sort;

import java.util.Arrays;

/*
 * 버블정렬
 * 인접한 요소의 값을 비교해서 swap
 */
public class BubbleSortTest {
	public static void main(String[] args) {
		int[] arr = {77,19,22,23,7,4,5};
		//버블정렬알고리즘으로 오름차순정렬하기
		//몇 번째 회차인지 나타내기 위한 for
		for(int i=0;i<arr.length-1;i++) {
			//외분 for의 반복이 i번째일때 이미 뒤쪽 i개는 정렬이 완료된 상태이므로 i를 빼고 반복해야 해서
			//내부for의 조건을 만들때 빼준다.
			//j가 비교할 숫자들에 대핸 index
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					//swap하기 - 비교해서 값이 큰 경우 뒤로 보내기
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr)); // -> 한줄씩 바꾸는 결과르 보는 값
		}
		System.out.println("============================");
		
		System.out.println(Arrays.toString(arr));// 4 5 7 19 22 23 77
	}

}
