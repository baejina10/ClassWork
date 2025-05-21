package basic.io;

import java.io.IOException;
import java.io.InputStream;

//InputStream클래스 테스트
//~~InputStream의 최상위클래스
public class InputStreamTest {
	public static void main(String[] args) {
		InputStream myin = System.in;
		//키보드로 입력하는 데이터를 읽기 - read메소드
		try {
			while(true) {
				//read는 키보드로 입력되는 데이터를 한 바이트 읽어서 리턴
				int data = myin.read();//예외가 발생할 수 있는 코드

				if(data==10) {
					break;
				}
				System.out.print((char)data);
			}
		}catch (IOException e) {
			System.out.println("입력오류....");
			e.printStackTrace();
		}
		

	}

}
