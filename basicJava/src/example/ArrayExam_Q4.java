package example;

public class ArrayExam_Q4 {
//정수 배열 int[] arr = {1, 3, 5, 7, 9};에서 모든 요소를
//오른쪽으로 한 칸씩 이동한 새 배열을 출력하세요. 

	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9};
		int temp = arr[0]; //temp = 1이라는 값이 들어감
		temp=arr[4];
		arr[1]=arr[0];
		
		
		/*
		arr[0]=arr[4];
		arr[1]=arr[0];
		arr[2]=arr[1];
		arr[3]=arr[2];
		arr[4]=arr[3];
		System.out.println(arr[1]);
	    */
		
		/*
		for(int i=0;i<arr.length;i++) {
			num=arr[i];
			num++;
		}
		System.out.print("이동 결과:"+num);
		*/
	}

}
