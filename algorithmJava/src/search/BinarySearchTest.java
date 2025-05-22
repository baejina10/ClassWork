package search;

import java.util.Arrays;
import java.util.Scanner;

//선형검색
public class BinarySearchTest { //데이터가 많아야 좋은 코드
	public static void main(String[] args) {
		int[] arr = {77,19,22,23,7,4,5};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Scanner key = new Scanner(System.in);
		System.out.println("찾을 숫자:");
		int searchValue = key.nextInt();
		long start = System.nanoTime();
	    int position = search(arr, searchValue);
	    long end = System.nanoTime();
	    System.out.println("탐색시간:"+(end-start));
		if(position==-1) {
			System.out.println("찾는 데이터가 없습니다.");
		} else {
			System.out.println("데이터의 위치:"+position);
		}
	}
	//이진탐색할 수 있도록 search메소드 작성하기
	/* 1. index를 저장할 수 있도록 변수정의
	 * 2. 전체 탐색할 배열에서 중앙값을 찾는다.
	 * 3. 중앙값과 찾는값을 비교
	 * 4. 중앙값 > 찾는값 : 중앙값을 기준으로 왼쪽의 데이터들만 비교, endIndex를 조절
	 * 5. 중앙값 < 찾는값 : 중앙값을 기준으로 오른쪽 데이터들만 비교, startIndex를 조절
	 * 6. 중앙값 == 찾는값 : 반복문 빠져나오기(비교종료)
	 */
	
	public static int search(int[] arr,int searchValue) {
		
		int searchIndex = -1;
		int startIndex = 0;
		int endIndex = arr.length-1;
		//중앙값
		int mediumIndex = 0;//지역변수 초기화
		while(startIndex<=endIndex) {
			mediumIndex = (startIndex+endIndex)/2;
			System.out.println(startIndex+","+mediumIndex+","+endIndex);
			if(arr[mediumIndex]==searchValue) {
				searchIndex = mediumIndex;
				break;
			}else if(arr[mediumIndex]>searchValue) {
				//찾으려는 값보다 중앙값이 크면 중앙값 뒤의 값들은 비교하지 않는다.
				endIndex = mediumIndex-1;
			}else {//중앙값이 작은 경우
				//찾으려는 값보다 중앙값이 작으면 중앙값 앞의 값들은 비교하지 않는다.
				startIndex = mediumIndex+1;
			}
		}
		
		return searchIndex;
	}  

}
