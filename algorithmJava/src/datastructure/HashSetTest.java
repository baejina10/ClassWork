package datastructure;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Set자료구조를 테스트
//=> 대표적인 Set을 구현하는 자바의클래스 HashSet
public class HashSetTest {

	public static void main(String[] args) {
		// 1. HashSet을 생성
		HashSet<String> set = new HashSet<String>();
		// 2. HashSet에 데이터 추가
		set.add("자바");
		set.add("서블릿");
		set.add("스프링");
		set.add("안드로이드");
		set.add("자바");
		display(set);
		// 3. HashSet에 저장된 요소의 갯수
		System.out.println(set.contains("스프링"));
		
		
		
		
		// 4. 모든데이터를 출력하기
		
		
		
		
		
	}	
	public static void display(Set<String> set) {
		System.out.println("=================");
		for(String data:set) {
			System.out.println(data);
		}
		System.out.println("사이즈=> "+set.size());
	}

}
