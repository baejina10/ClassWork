package oop.basic.chap05;
//2단부터 9단까지 구구단을 모두 출력하기
public class MultiForGuGu {
	public static void main(String[] args) {
		MyMethodDemo multiForGuGu = new MyMethodDemo();	
		multiForGuGu.printGuGu();
//		for(int dan=2;dan<=9;dan++) {
//			for(int i=1;i<=9;i++) {
//				System.out.print(dan +" * "+i+" = "+(dan*i)+"\t");
//			}
//			System.out.println();
//		}
		
		System.out.println("--------------------------------------------");
		for(int i=1;i<=9;i++) {
			for(int dan=2;dan<=9;dan++) {
				System.out.print(dan +" * "+i+" = "+(dan*i)+"\t");
			}
			System.out.println();
		}
	}

}
