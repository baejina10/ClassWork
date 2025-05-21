package chap04;

public class ForExam_Overlap {

	public static void main(String[] args) {
		//중첩 for문 연습1
		int n=0;
		for(int i=1;i<=5;i++) {
			for(int x=1;x<=5;x++) {
				n=n+1;
				System.out.print(n+"\t");
			}
			
		System.out.println();
		}
		System.out.println("===========================");
		//중첩 for문 연습2
		//숫자 대신 *을 넣는 조건=> 그러면 숫자가 먼저 쌓여가 하는거 같다! 
		//내가 처음에 틀린건 별이 먼저 실행되고 그다음에 숫자가 쌓이는거라 안되는 거였음..!
		int val = 0;
		for(int a=1; a<=5;a++) {
			for(int b=1;b<=5;b++) {
//				boolean same = (a==b);
//				val+=1;
//				if(!same) {
//					System.out.print(val+"\t");
//				} else {
//					System.out.print("*\t");
//				}
				val+=1;
				if(a==1 & b==1) {
					System.out.print("*\t");
				} else if(a==2 & b==2) {
					System.out.print("*\t");
				} else if(a==3 & b==3) {
					System.out.print("*\t");
				} else if(a==4 & b==4) {
					System.out.print("*\t");
				} else if(a==5 & b==5) {
					System.out.print("*\t");
				} else {
					System.out.print(val+"\t");
				}
				
			}
			System.out.println();
		}

	}

}
