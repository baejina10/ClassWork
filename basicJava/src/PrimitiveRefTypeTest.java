public class PrimitiveRefTypeTest {
//기본형과 참조형 변수의 비교
	public static void main(String[] args) {
		//기본형변수는 값을 저장하고 참조형변수는 주소를 저장하기 때문에 비교하는 경우 같은 객체라고 해도 다를 수 있다.
		int i = 10;
		int j = 10;
		System.out.println("********기본형*********");
		if(i==j) {
			System.out.println("기본형같다.");
		} else {
			System.out.println("기본형다르다.");
		}
		
		String str1 = new String("java");
		String str2 = new String("java");
		
		System.out.println("********참조형*********");
		if(str1==str2) {
			System.out.println("참조형같다.");
		} else {
			System.out.println("참조형다르다.");
		}
		System.out.println("********문자열비교*********");//.equals는 문자열을 비교한다
		if(str1.equals(str2)) {
			System.out.println("문자열같다.");
		} else {
			System.out.println("문자열다르다.");
		}
		
		System.out.println("********참조변경*********");
		str1 = str2;
		if(str1==str2) {
			System.out.println("참조형같다.");
		} else {
			System.out.println("참조형다르다.");
		}
		
	}

}
