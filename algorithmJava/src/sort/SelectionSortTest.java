package sort;

import java.util.Arrays;
//선택정렬을 이용해서 정렬
public class SelectionSortTest {

	public static void main(String[] args) {
		int[] arr = {77,19,22,23,7,4,5};
		//min값에 대한 index를 지정하고 (최초에는 0으로 셋팅)
		//반복문이 1회가 완료가 되면 가장 작은 값을 맨 앞으로 보내기
		
		for(int i=0;i<arr.length;i++) {
			//순서대로 앞에서 부터 작은 값을 위치시킬것이므로 i값을 min으로 정의
			int minIdx = i; //최초작업이 0부터 - 정렬되지 않은 영역의 가장 처음 값을 기준으로 잡고 작업
			for(int j=i+1;j<arr.length;j++) { //기준값을 제외한 나머지 값들과 반복해서 처리
				if(arr[minIdx]>arr[j]) {
					minIdx = j;
				}
			}//최종작업이 완료되면 minidx는 제일 작은 값이 있는 index로 바꾼다
			//작은 값과 기준값을 swap
			int temp = arr[i];//기준요소의 값을 임시변수에 저장
			arr[i] = arr[minIdx];//최소값을 앞으로 이동
			arr[minIdx] = temp;//기준값을 최소값자리로 이동
			System.out.println(Arrays.toString(arr)); // ->진행 과정을 보기 위한 출력
		}
		System.out.println("===================================");
		System.out.println(Arrays.toString(arr));// 4 5 7 19 22 23 77

	}

}
