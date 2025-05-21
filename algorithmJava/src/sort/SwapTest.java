package sort;

import java.util.Arrays;

public class SwapTest {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		System.out.println(Arrays.toString(arr));
		//1번요소와 2번요소를 값을 서로 바꾸고 싶은 경우
		//데이터를 교환하는 경우 임시변수를 하나 선언하고 값을 저장한 후 처리한다.
		
		int temp = arr[1];
		arr[1] = arr[2];
		arr[2] = temp;
		System.out.println(Arrays.toString(arr));
		
	}

}
