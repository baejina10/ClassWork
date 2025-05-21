package api.lang;
//String객체의 비교
// - 리터럴로 생성
// - new연산자를 이용해서 생성
public class StringTest2 {
	public static void main(String[] args) {
		String str1 = new String("java");
		String str2 = new String("java");
		String str3 = "java";
		String str4 = "java";
		//객체와 객체
		if(str1==str2) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		System.out.println("=======================");
		//문자열상수와 문자열상수(객체처럼 메소드나 다른 작업이 가능)
		if(str3==str4) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		System.out.println("=======================");
		if(str1==str4) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
	}

}
