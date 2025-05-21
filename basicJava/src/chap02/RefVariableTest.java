package chap02;
import java.util.*;
//참조형변수 선언 연습
public class RefVariableTest {

	public static void main(String[] args) {
		//기본형
		int i = 100;
		int size = 0;
		System.out.println("문자열의 길이=>"+size);
		/*
		 * 문자열을 처리하는 기능을 사용하기 위해서 String클래스를 JVM이 인식하는 작업 공간에 활당
		 *                                               --------------
		 *                                               JVM이 찾아서 사용할 수 있도록
		 *                                               미리 약속된 공간(heap)
		 * [기본형]
		 * 데이터타입 변수명 = 값;
		 * [참조형]
		 * 클래스명 변수 = new 클래스명()
		 *                 -------
		 *  heap에 할당된    heap에 할당해서 사용하고 싶은 클래스명                  
		 *  어떤 클래스를
		 *  사용할 것인지
		 *  타입을 정의                            
		 */
		//str변수는 힙에 할당된 String클래스를 사용할 수 있도록 참조하는 변수
		String str = new String("java");
		//String에 정의되어 있는 length라는 메소드를 호출
		//length메소드의 실행결과가 int형의 값이므로 값은 타입의 변수를 선언해서 결과를 저장
		//결과를 저장하지 않으면 메소드실행결과를 사용할 수 없다.
		int length = str.length();
		System.out.println("문자열의 길이=>"+length);
		
		//object클래스를 사용 - java.lang패키지
		Object obj = new Object();
		
		//Thread클래스를 사용 - java.lang패키지
		Thread t = new Thread();
		
		//Random클래스를 사용 - java.util패키지
		//JVM이 기본으로 인식하는 패키지의 위치는 현재 작업패키지(chap02)와 java.lang패키지뿐
		//기본으로 인식하는 패키지 이외의 패키지는 JVM이 인식할 수 있도록 처리해야한다.
		//import명령문으로 패키지를 정의
		/*
		 * package선언
		 * import 패키지명
		 * 클래스선언문
		 */
		Random rand = new Random();
		
		
		
		
		
	}

}






