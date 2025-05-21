package basic.io.exam;
//basic.io의 InputScreamTest 파일을 복습하고자 다시 작성한 클래스이다.
//키보드로 입력하는 데이터를 읽기 - read메소드
import java.io.IOException;
import java.io.InputStream;

/**
  * <정리 - 개인적 생각이라 정확하지 않음!>
  * read는 키보드로 입력되는 데이터를 1byte만 지원을 한다. 영어는 1byte여서 실행하면 출력이 된다.
  * 한글은 기본 2byte 지원이라 InputScream에서 실행하면 출력이 깨진다.
  * 
  */

public class InputStreamExam1 {
	public static void main(String[] args) {
		InputStream in = System.in;
		try {
			while(true) {
				int data = in.read();
				if(data==10) {//10은 엔터의 아스키코드이다! 그래서 엔터인 10과 같으면 반복문에 벗어난다.
					break;
				}
				System.out.println((char)data);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
			
			
	}

}
