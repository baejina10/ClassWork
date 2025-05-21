package chap05;

public class ArrayExam4 {

	public static void main(String[] args) {
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		
		//홀짝 구분해서 홀합과짝합을 구하라
		System.out.println("( 배열 ia )");
		int evenIasum = 0;
		int oddIasum = 0;
		for(int i=0;i<ia.length;i++) {
			if(ia[i]%2==0) {
				evenIasum=evenIasum+ia[i];
			} else {
				oddIasum=oddIasum+ia[i];
			}
		}
		System.out.println("홀수의 합:"+oddIasum);
		System.out.println("짝수의 합:"+evenIasum);
		
		//ib값
		System.out.println("( 배열 ib )");
		int evenIbsum = 0;
		int oddIbsum = 0;
		for(int i=0;i<ib.length;i++) {
			if(ib[i]%2==0) {
				evenIbsum=evenIbsum+ib[i];
			} else {
				oddIbsum=oddIbsum+ib[i];
			}
		}
		System.out.println("홀수의 합:"+oddIbsum);
		System.out.println("짝수의 합:"+evenIbsum);
	}

}
