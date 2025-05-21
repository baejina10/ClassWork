package example;

public class ArrayExam_Q3 {

	public static void main(String[] args) {
		//3. int[] arr = {10, -3, 25, -7, 33, -5};에서 양수의 합과 음수의 합을 각각 출력하세요.
		int[] arr = {10,-3,25,-7,33,-5};
		int positive = 0;
		int negative = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				positive+=arr[i];
			} else {
				negative+=arr[i];
			}
		
		}
		System.out.println("양수의 합:"+positive);
		System.out.println("음수의 합:"+negative);
	}

}
