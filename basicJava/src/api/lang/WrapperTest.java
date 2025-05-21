package api.lang;

public class WrapperTest {

	public static void main(String[] args) {
		//Integer inobj = new Integer(1000);
		Integer  in = 100;//5.0부터 가능 - 오토박싱
						  // 컴파일러가 자동으로 int데이터를 Integer객체로 생성하는 작업을 수행
		
		test(10000);
		int data = 10000+Integer.parseInt("100");
		System.out.println(data);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println("Character.isUpperCase('a')=>"+Character.isUpperCase('a'));
		System.out.println(Character.isAlphabetic(67));
		System.out.println(Character.toUpperCase('a'));
		
	}
	public static void test(Integer data) {
		int result = 100+data; //오토언박싱 - 컴파일러가 참조형인 Integer객체의 값을 intValue로 변경하여 전달
		System.out.println(result);
	}

}
