package api.lang;

import java.util.ArrayList;
import java.util.Date;

public class ObjectTest1 {
	public static void main(String[] args) {
		Person p1 = new Person("BTS","서울",901112);
		Person p2 = new Person("BTS","서울",901112);
		test(p1);
		test(p2);
		//1. toString()
		//=> 객체가 할당되는 메모리의 주소
		//              ----------
		//               객체가 갖고 있는 속성들과 메모리주소를 기반으로 변환한 값들을 출력
		//=> Object클래스가 갖고 있는 메소드 중 기본 메소드
		System.out.println("------------------------");
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj2);
		System.out.println(obj2.toString());
		System.out.println("------------------------");
		
		String str = new String("java");
		System.out.println(str);
		
		Date date = new Date();
		System.out.println(date);
		
	    System.out.println("-------------------------------");
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("sql");
        list.add("linux");
        list.add("jdbc");
        System.out.println(list);
	}
	public static void test(Person p) {
		System.out.println(p.toString());
		System.out.println(p);
		//입력값을 검증
		System.out.println(p.getName()+","+p.getAdd()+","+p.getAge());
		
	}

}
