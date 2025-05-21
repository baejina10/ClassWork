package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
 * ArrayList에 저장되어 있는 데이터를 HashSet으로 변환하고 
 * HashSet에 저장된 데이터를 이용해서 아래와 같은 출력결과를 만들어보세요.
 * 58 ----(짝수)
 * 88 ----(짝수)
 * 79 ----(홀수)
 * ...
 * 
 * 총점:____
 * 평균:____
 * 
 */
public class HashSetExam1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
        list.add(99);
        list.add(100);
        list.add(88);
        list.add(95);
        list.add(45);
        //HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set = new HashSet<>(list);
//        for(Integer data:list) {
//        	 set.add(data);
//        }
        int total = 0;
		for(int data:set) {
			total = total+data;
			if(data%2==0) {
				System.out.println(data+" ---- (짝수)");
			}else {
				System.out.println(data+" ---- (홀수)");
			}
		}
		System.out.println("총점: "+total);
		System.out.println("평균: "+(total/set.size()));
		
		
		
	}

}
