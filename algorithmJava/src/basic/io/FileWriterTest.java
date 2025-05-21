package basic.io;

import java.io.FileWriter;
import java.io.IOException;

//파일출력하기 - 3단계
//=> FileWriter이용
public class FileWriterTest {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			//1. 파일오픈
			// => 출력할 파일과 연결
			// => 파일이 존재하지 않으면 파일을 생성해서 작업
			// => 파일출력의 기본은 덮어쓰기
			// => 덮어쓰지 않고 append하고 싶은 경우 append를 지원하는 생성자를 사용하기
			//    append값을 true로 정의하면 추가하겠다는 의미
			//fw = new FileWriter("output.txt"); - 덮어쓰기
			fw = new FileWriter("src/datafile/output2.txt",true); //append
			//2. 파일액세스
			//=> write메소드는 newline이 포함되지 않음
			//=> 출력스트림의 내부에 파일에 쓰기 위한 데이터를 쌓아놓은 것
			fw.write(97);
			fw.write('A');
			fw.write("안녕~~~~~~~~~~~\n");
			fw.write("파일쓰기연습~~~~~~~~~~~~\n");
			
		}catch (IOException e) {
			System.out.println("출력오류~");
		}finally {
			//3. 파일의 자원 반납
			// => 오픈된 파일을 닫고 OS에게 점유했던 파일리소스를 반납해야
			//    모든 내용이 파일에 쓰여진다.
			// => 자원반납은 무조건 실행되어야 하므로 finally블럭에서 처리
			try {
				//fw가 null이면 close호출할때 NullPointException이 또 발생하므로 null체크하고 close호출
				//해서 자원을 반납한다
				if(fw!=null) fw.close();
			} catch (IOException e) {
				
			}
			
		}
		
	}

}
