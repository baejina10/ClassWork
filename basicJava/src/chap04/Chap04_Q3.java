package chap04;

public class Chap04_Q3 {

	public static void main(String[] args) {
		//for문 하나로 한거
		String str = "";
		for(int i=1;i<=4;i++) {
			str=str+"*";
			System.out.println(str);
		}
		System.out.println("--------------------------------");
		//중첩 for문으로 한거
		
		for(int row=1;row<=4;row++) {
			for(int k=0;k<row;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		//역으로 *찍기
		for(int x=1;x<=4;)

	}

}
