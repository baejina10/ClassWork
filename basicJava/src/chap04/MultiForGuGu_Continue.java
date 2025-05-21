package chap04;
//continue 연습 => 스킵 같은 느낌으로 이해하면 될듯 (나의 생각)
public class MultiForGuGu_Continue {

	public static void main(String[] args) {
		
		for(int i=2;i<=9;i++) {
//			if(i==5) {
//				continue;
//			}
			for(int m=1;m<=9;m++){
				if(i==5) {
					continue;
				}
				System.out.print(i+"*"+m+"="+(i*m)+"\t");
			}
			System.out.println();
		}
		
	}

}
