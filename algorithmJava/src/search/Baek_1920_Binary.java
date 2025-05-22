package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_1920_Binary {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//1. 검색할 원본배열을 만들기
		int arrCount = Integer.parseInt(br.readLine());
		String line = br.readLine();//배열 값 
		String[] strArr = line.split(" ");
		int[] arr = new int[arrCount];
		for(int i=0;i<arrCount;i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		//2. 배열을 정렬하기
		Arrays.sort(arr); //오름차순으로 정렬
		//3. 찾을 문자열과 갯수를 입력 받아서 배열로 변환 후 검색
		int answerCount = Integer.parseInt(br.readLine());
		String secline = br.readLine();// 확인하고자 하는 답
		String[] secArr = secline.split(" ");
		
		//4. 찾을 숫자의 갯수만큼 for문을 반복해서 실행해서 seach 메소드를 호출
		StringBuilder sb = new StringBuilder();
		for(String searchValue : secArr) {
			int result = search(arr, Integer.parseInt(searchValue));
			sb.append(result+"\n");
		}
		System.out.println(sb);
		
	}
	
	//바이너리 찾기 메소드
	public static int search(int[] arr, int searchValue) {
		int searchIndex = 0;//찾기 못한 경우 - 0, 찾은 경우 - 1
		int startIndex = 0;
		int endIndex = arr.length-1;
		//중앙값
		int mediumIndex = 0;//지역변수 초기화
		while(startIndex<=endIndex) {//조건을 만족하는 동안 반복 작업
			mediumIndex = (startIndex+endIndex)/2;
			//System.out.println(startIndex+","+mediumIndex+","+endIndex);
			if(arr[mediumIndex]==searchValue) {
				searchIndex = 1;
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

