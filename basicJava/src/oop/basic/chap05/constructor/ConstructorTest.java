package oop.basic.chap05.constructor;

public class ConstructorTest {

	public static void main(String[] args) {
		Constructor obj = new Constructor();
		System.out.println(obj);
		Constructor obj2 = new Constructor();
		System.out.println("-------------------------------------------------------------");
		Constructor obj3 = new Constructor("뷔", "bts1", "1234");
		System.out.println("성명:"+obj3.getName()+",id:"+obj3.getId());
		System.out.println("-------------------------------------------------------------");
		Constructor obj4 = new Constructor("뷔", "bts1", "1234","광주","010","2001","뷔",20000);
		System.out.println("성명:"+obj4.getName()+",id:"+obj4.getId());
	}

}
