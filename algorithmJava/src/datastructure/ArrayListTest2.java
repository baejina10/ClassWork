package datastructure;

import java.util.ArrayList;
import java.util.List;
// List - ArrayList의 기타 메소드 사용방법
// List는 중복이 허용
public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("mysql");
		list.add("github");
		list.add("linux");
		list.add("algorithm");
		list.add("algorithm");
		System.out.println("사이즈=> "+list.size());
		display(list);
		//업데이트 - 4번요소의 값을 수정
		list.set(4, "spring & spring boot");
		display(list);
		//마지막에 요소를 추가하기
		list.add("android");
		display(list);
		//중간에 삽입하기
		list.add(3, "javascript");
		display(list);
		//지우기
		list.remove(1);//1번 index에 해당하는 요소를 삭제
		display(list);
		//동일한 요소가 저장된 경우에 삭제를 하면 첫 번째 요소를 찾아서 제거
		list.add("javascript");//저장된 객체 중 지정해서 삭제
		display(list);
		list.remove("javascript");
		display(list);
		
		System.out.println(list.contains("java")); //contains은 단어가 포함 되어있는지 확인하는 메소드
		System.out.println(list.contains("hadoop"));
		System.out.println(list.isEmpty());//list가 비어있는지 아닌지 확인
		
	}
	//ArrayList의 요소를 출력하는 메소드
	public static void display(List<String> list) {
		System.out.println("=================");
		for(String data:list) {
			System.out.println(data);
		}
		System.out.println("사이즈=> "+list.size());
	}
}
