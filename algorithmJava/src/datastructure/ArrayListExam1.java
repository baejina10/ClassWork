package datastructure;

import java.util.ArrayList;
import java.util.Random;

/*
 * 1부터100까지 랜덤수 5개를 이용해서 ArrayList에 저장하고 (58 88 79 100 49)
 * 58 ----(짝수)
 * 88 ----(짝수)
 * 79 ----(홀수)
 * ...
 * 
 * 총점:____
 * 평균:____
 * 
 */
public class ArrayListExam1 {
	public static void main(String[] args) {
		Random rand = new Random();//랜덤 객체를 만든다.
		ArrayList<Integer> list = new ArrayList<Integer>();
	/*	
		int total = 0;
		for(int i=0;i<5;i++) {
			list.add(rand.nextInt(1, 101));
			if(list.get(i)%2==0) {
				System.out.println(list.get(i)+" ---- (짝수)");
			}else {
				System.out.println(list.get(i)+" ---- (홀수)");
			}
			total = total + list.get(i);
			
		}
		System.out.println("총점: "+total);
		System.out.println("평균: "+total/5);
		*/
		
		//강사님 답
		//랜덤ㅁ수를 저장하는 for
		for(int i=1;i<=5;i++) {
			list.add(rand.nextInt(100)+1);
		}
		//arraylist에 저장된 데이터를 꺼내는 for
		int total = 0;
		for(int data:list) {
			total = total+data;
			if(data%2==0) {
				System.out.println(data+" ---- (짝수)");
			}else {
				System.out.println(data+" ---- (홀수)");
			}
		}
		System.out.println("총점: "+total);
		System.out.println("평균: "+total/5);
		
	}

}
