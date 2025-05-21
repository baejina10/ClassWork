package api.lang;

import java.util.Objects;

//Objects클래스는 객체관련 작업을 편하게 할 수 있도록 제종되는 유틸리티
public class ObjectsTest {

	public static void main(String[] args) {
		Person p1 = new Person("BTS","서울",901112);
		Person p2 = new Person("BTS","서울",901112);
		System.out.println(Objects.equals(p1, p2)); //객체를 비교

	}

}
