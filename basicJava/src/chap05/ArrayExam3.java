package chap05;
//int[] scoreArr = {98,99,100,89,88};
//배열의 모든 값을 더해서 총합을 구하고 평균을 구하기
public class ArrayExam3 {

	public static void main(String[] args) {
		int[] scoreArr = {98,99,100,89,88};
		int sum = 0;
		for(int i=0;i<scoreArr.length;i++) {
			sum = sum+scoreArr[i];
		}
		System.out.println("총합:"+sum);
		System.out.println("평균:"+(sum/scoreArr.length));
		System.out.println("평균:"+((double)sum/scoreArr.length));
	}

}
