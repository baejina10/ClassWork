package chap04;
//forexam hap을 while문으로 수정하는 작업
public class WhileExam1 {

	public static void main(String[] args) {
		int hap = 0;
		int oddHap = 0;
		int evenHap = 0;
		int i = 1; //카운터변수
		
		while(i<=100) {
			hap=hap+i;
			
			if(i%2==0) {
				evenHap = evenHap+i;
			} else {
				oddHap = oddHap+i;
			}
			i++;	
		}
		System.out.println("총합:"+hap);
		System.out.println("홀수합:"+oddHap);
		System.out.println("짝수합:"+evenHap);
		int a=1;
		int sum=0;
		while (true) {
			if(a>100) {
				break;
			}
			sum=sum+a;
			a++;
		}
		System.out.println("총합:"+sum);
		

	}

}
