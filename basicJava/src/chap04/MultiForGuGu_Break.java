package chap04;
//break 연습
public class MultiForGuGu_Break {

	public static void main(String[] args) {
		
		for(int i=2;i<=9;i++) {
			if(i==5) {
				break;
			}
			for(int m=1;m<=9;m++){
//				if(i==5) {
//					break;
//				}
				System.out.print(i+"*"+m+"="+(i*m)+"\t");
			}
			System.out.println();
		}
		
	}

}
