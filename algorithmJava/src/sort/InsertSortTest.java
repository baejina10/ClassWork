package sort;

import java.util.Arrays;

public class InsertSortTest {

	public static void main(String[] args) {
		int[] arr = {77,19,22,23,7,4,5};
		
		//내가 한거
		/*
		for(int i=1;i<arr.length;i++) {//정렬되지 않은 값 넣기
			int num = i;
			
			for(int j=0;j<i;j++) {
				if(arr[num]<arr[j]) {
					num = j;
				} 
				int temp = arr[i];
				arr[i] = arr[num];
				arr[num] = temp;	
			}
			
			System.out.println(Arrays.toString(arr));
		}
		*/
		
		//강사님 출력
		// 0번요소는 정렬된 값이라 판단하고 작업
		// 정렬되지 않은 영역에서 첫 번째 값을 가지고 작업하기 시작
		for (int i = 1; i < arr.length; i++) {// 정렬되지 않은 값 넣기
			// 정렬된 영역의 마지막 데이터부터 역순으로 비교
			for (int j = i; j>0; j--) {
				if (arr[j] < arr[j-1]) {
			//      ------   --------
			//       정렬X      정렬O
					  //정렬되지 않은 영역의 요소가 정렬된 영역의 요소보다 작으면 작은 값을 앞으로 이동
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					
				} else {
					break;
				}
			}

			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("===================================");
		System.out.println(Arrays.toString(arr));// 4 5 7 19 22 23 77
	}

}
