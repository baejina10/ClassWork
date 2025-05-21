package oop.basic.chap05;
//사용자정의 클래스인 Person을 사용(테스트)하기 위한 클래스
public class PersonTest {

	public static void main(String[] args) {
		//객체새성 - 우리가 만든 클래스를 사용하기 위해 메모리에 할당하는 작업
		//new연산자에 의해 힙에 할당
		Person p1 = new Person(); 
		System.out.println("성명:"+p1.name);
		System.out.println("주소:"+p1.addr);
		System.out.println("아니:"+p1.age);
		System.out.println("포인트:"+p1.point);
		
		//객체의 필드에 값을 셋팅
		p1.name = "진";
		p1.addr = "서울";
		p1.age = 30;
		p1.point = 10000;
		
		//객체에 저장된 값을 출력하기
		System.out.println(p1);
		System.out.println("성명:"+p1.name);
		System.out.println("주소:"+p1.addr);
		System.out.println("아니:"+p1.age);
		System.out.println("포인트:"+p1.point);	
		
		System.out.println("----------------------------");
		
		Person p2 = new Person();
		p2.name = "제이홉";
		p2.addr = "광주";
		p2.age = 28;
		p2.point = 10000;
		
		System.out.println(p2);
		System.out.println("성명:"+p2.name);
		System.out.println("주소:"+p2.addr);
		System.out.println("나이:"+p2.age);
		System.out.println("포인트:"+p2.point);
		
	}

}
