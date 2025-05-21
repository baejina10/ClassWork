package chap04;
//2단부터 9단까지 구구단을 모두 출력하기
public class MultiForGuGu {

	public static void main(String[] args) {
		//가로줄
		for(int i=2;i<=9;i++) {
			for(int m=1;m<=9;m++){
				System.out.print(i+"*"+m+"="+(i*m)+"\t");
			}
			System.out.println();
		}
		System.out.println();
		//세로줄
		for(int i=1;i<=9;i++) {
			for(int m=2;m<=9;m++){
				System.out.print(m+"*"+i+"="+(i*m)+"\t");
			}
			System.out.println();
		}
		
	}

}
