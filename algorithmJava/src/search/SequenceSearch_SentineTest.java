package search;

import java.util.Scanner;

//선형검색
//배열에 찾으려고 하는 값을 추가하자.
public class SequenceSearch_SentineTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("찾을 숫자:");
		int searchValue = key.nextInt();
		int[] arr = {77,19,22,23,7,4,5,searchValue};
		long start = System.nanoTime();
	    int position = search(arr, searchValue);
	    long end = System.nanoTime();
	    System.out.println("탐색시간:"+(end-start));
	    //찾는 숫자가 배열의 마지막 index이면 찾는 값이 배열에 없다는 의미
		if(position==arr.length-1) {
			System.out.println("찾는 데이터가 없습니다.");
		} else {
			System.out.println("데이터의 위치:"+position);
		}
	}
	//searchValue의 위치를 리턴, 없으면 -1을 리턴
	//arr은 찾으려고 하는 값이 저장된 배열
	//searchValue가 실체 찾는 값
	//배열을 이용해서 탐색
	public static int search(int[] arr,int searchValue) {
		int result = 0;
		//searchValue의 index를 리턴하도록 코드를 작성
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==searchValue){
				result = i;
				break;
			} else {
				result = -1;
			}
		}
		return result;
	}  

}
