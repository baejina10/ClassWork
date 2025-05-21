package basic.io.exam;

import java.io.InputStreamReader;

//basic.io의 InputScreamReaderTest 파일을 복습하고자 다시 작성한 클래스이다.

public class InputStreamReaderExam {
	public static void main(String[] args) {
		InputStreamReader inr = new InputStreamReader(System.in);
		try {
			while(true) {
				int data = inr.read();
				if(data==10) {
					break;
				}
				System.out.print((char)data);//char을 강제형변환을 한 이유는 data의 타입이 int라 그냥 출력을 하면 아스키코드가 나와서 변환을 해줬다.
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
