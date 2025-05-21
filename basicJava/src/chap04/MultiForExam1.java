package chap04;

public class MultiForExam1 {

	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
			for(int i=1;i<=5;i++) {
				System.out.print("2");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		//다시
		for(int row=1;row<=5;row++) {
			for(int i=1;i<=5;i++) {
				if(i==3 & row==3) {
					System.out.print("너");
				} else {
					System.out.print("2");
				}
			}
		    System.out.println();
		
		}
		System.out.println("---------------------");
		//대각선 *
		for(int row=1;row<=5;row++) {
			for(int i=1;i<=5;i++) {
				if(i==1 & row==1) {
					System.out.print("너");
				} else if(i==2 & row==2) {
					System.out.print("너");
				} else if(i==3 & row==3) {
					System.out.print("너");
				} else if(i==4 & row==4) {
					System.out.print("너");
				} else if(i==5 & row==5) {
					System.out.print("너");
				} else {
					System.out.print("2");
				}
			}
		    System.out.println();
		
		}
		
	}

}
