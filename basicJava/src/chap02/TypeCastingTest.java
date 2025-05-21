package chap02;
//변수의 형변환에 대해서 살펴보기
//자동형변환과 명시적형변환이 있다.

public class TypeCastingTest {
	public static void main(String[] args) {
		//자동형변환
		byte b = 100;
		short s = b;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		System.out.println(d);
		char c = 'a';
		int data = c;
		System.out.println(data);
		char c2 = (char)data;
		System.out.println(c2);
		
		
		
		
	}
}
