package algorithm.array;
//String은 원본이 변경되지 않고 메소드 호출 결과나 +로 만들어지는 모든 문자열이 각각의 객체로 힙에 할당
//문자열조작이 많은 곳에서 부적합
//문자열조작이 많은 작업을 하는 경우에는 Stringbuffer나 StringBuilder를 사용
//                           ----------------------------
//                                 원본이 사용
public class StringBuilderTest {
	public static void main(String[] args) {
		String str = new String("java programming");
		System.out.println(str.concat("어렵다ㅠㅠ"));
		System.out.println("string원본=>"+str);
		
		
		StringBuilder sb = new StringBuilder("java programming");
		//문자열 뒤에 새로운 문자열 추가하기
		sb.append("어렵다ㅠㅠ");
		System.out.println("StringBuilder원본=>"+sb);
		//문자열 중간에 새로운 문자열 추가하기
		sb.insert(5, "java");
		System.out.println("StringBuilder원본=>"+sb);
		//문자열 거꾸로 바꾸기
		sb.reverse();
		System.out.println("StringBuilder원본=>"+sb);
	}

}
