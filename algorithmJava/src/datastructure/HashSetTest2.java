package datastructure;

import java.util.HashSet;
import java.util.Set;

//합집합과 교집합 - 집합의 특성
public class HashSetTest2 {
	public static void main(String[] args) {
		//1. HashSet생성
		HashSet<String> set1 = new HashSet<String>();
		set1.add("java");
        set1.add("mysql");
        set1.add("servlet");
        set1.add("jdbc");
        set1.add("jsp");
        set1.add("spring");
        set1.add("css");
		display(set1);
		
		//합집합 - set을 생성할때 매개변수로 다른 set을 정의
		HashSet<String> set2 = new HashSet<String>(set1);
		set2.add("hadoop");
        set2.add("kafka");
        set2.add("spark");
        display(set2);
        //교집합
        HashSet<String> set3 = new HashSet<String>();
        set3.add("java");
        set3.add("servlet");
        set3.add("python");
        set3.add("Raspberry PI");
        display(set3);
        System.out.println();
        System.out.println("set1과set3의 교집합");
        //교집합을 하게 되면 교집합이 set3에 새로 셋팅된다.
        //set3.retainAll(set1);  - 교집합 구하는 코드
        display(set3);
        
        System.out.println();
        System.out.println("set2과set3의 합집합");
        set2.addAll(set3);
        display(set2);
        
        
	}
	public static void display(Set<String> set) {
		System.out.println("=================");
		for(String data:set) {
			System.out.println(data);
		}
		System.out.println("사이즈=> "+set.size());
	}
}
