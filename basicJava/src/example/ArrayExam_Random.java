package example;

import java.util.Random;

//1부터 100까지의 랜덤수가 배열에 저장될 수 있도록 작성하기
//int형 배열(요소 5개)
public class ArrayExam_Random {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] myarr = new int[5];
		//배열에 랜덤수 넣기
		for(int i=0;i<myarr.length;i++) {
			myarr[i]=rand.nextInt(100)+1;
		}	
		//짝홀 나타내기
		
		for(int row=0;row<myarr.length;row++) {
			if(myarr[row]%2==0) {
				System.out.println(row+"번 요소->"+myarr[row]+"(짝수)");
			} else {
				System.out.println(row+"번 요소->"+myarr[row]+"(홀수)");
			}
	
		}
		
		
		/*
		System.out.println("0번 요소->"+myarr[0]);
		System.out.println("1번 요소->"+myarr[1]);
		System.out.println("2번 요소->"+myarr[2]);
		System.out.println("3번 요소->"+myarr[3]);
		System.out.println("4번 요소->"+myarr[4]);
		
		
		/*
		for(int i=0;i<myarr.length;i++) {
			myarr[i]=10;	
		*/	
		
	}

}
