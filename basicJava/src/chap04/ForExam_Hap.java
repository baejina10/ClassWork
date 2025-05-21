package chap04;
//1부터100까지 합
//1부터100까지 홀수합
//1부터100까지 짝수합

//[출력형식]
//총합:__,홀수합__,짝수합__
public class ForExam_Hap {

	public static void main(String[] args) {
		
		System.out.println("--------내 답-----------");
		//내가 푼 답
		int sum = 0;
		for(int i=1;i<=100;i++) {
			sum = sum+i;
		}
		int oddSum = 0;
		for(int i=1;i<=100;i=i+2) {
			oddSum = oddSum+i;
		}
		int evenSum = 0;
		for(int i=2;i<=100;i=i+2) {
			evenSum = evenSum+i;
		}
		System.out.println("총합:"+sum);
		System.out.println("홀수합:"+oddSum);
		System.out.println("짝수합:"+evenSum);
		
		System.out.println("--------강사님 답-----------");
		
		//강사님 답 (if절도 쓴거)
		int hap = 0;
		int oddHap = 0;
		int evenHap = 0;
		for(int i=1;i<=100;i++) {
			hap = hap+i;
			if(i%2==0) {
				//System.out.println("짝수:"+i);
				evenHap = evenHap+i;
			} else {
				//System.out.println("홀수:"+i)
				oddHap = oddHap+i;
			}
		}
		System.out.println("총합:"+hap);
		System.out.println("홀수합:"+oddHap);
		System.out.println("짝수합:"+evenHap);
	}

}

