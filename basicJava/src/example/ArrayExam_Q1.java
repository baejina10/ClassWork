package example;

public class ArrayExam_Q1 {

	public static void main(String[] args) {
		// 1. 정수 배열 int[] arr = {10, 20, 5, 3, 100, 55};에서 가장 큰 값을 출력하세요.
		int[] maxArr= {10,20,5,3,100,55};
		
		int max = 0;
		for(int i=0;i<maxArr.length;i++) {
			if(max<maxArr[i]) {
				max=maxArr[i];
			}
		}
		System.out.println(max);
	}

}
