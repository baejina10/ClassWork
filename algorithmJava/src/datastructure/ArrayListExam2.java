package datastructure;

import java.util.ArrayList;

public class ArrayListExam2 {
	public static void main(String[] args) {
		String[] strArr = {"java","servlet","jsp","spring"};
		//2. changArrayList메소드를 호출해서 변환된 ArrayList를 받기
		ArrayList<String> list = changArrayList(strArr);
		
		//3. 메소드호출결과를 출력하기
		for(String data:list) {
			System.out.println(data);
		}
		System.out.println("==============");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
	//1. 메소드 정의
	//배열을 ArrayList로 변환해서 리턴하는 메소드를 정의
	//메소드명 - changArrayList
	//매개변수 - String[] arr
	//리턴타입 ArrayList<String>
	
	public static ArrayList<String> changArrayList(String[] arr) {
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		return list;
	}
	
}
