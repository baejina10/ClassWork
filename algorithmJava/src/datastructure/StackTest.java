package datastructure;
//JVM이 사용하는 스택구조에 대한 확인
public class StackTest {
	public void test1() {
		System.out.println("test1");
		test2();
		System.out.println("test1완료");
	}
	public void test2() {
		System.out.println("test2");
		test3();
		System.out.println("test2완료");
	}
	public void test3() {
		System.out.println("test3");
		test4();
		System.out.println("test3완료");
	}
	public void test4() {
		System.out.println("test4");
	}
	public static void main(String[] args) {
		StackTest obj = new StackTest();
		System.out.println("메인시작");
		obj.test1();
		System.out.println("메인종료");
	}
	

}
