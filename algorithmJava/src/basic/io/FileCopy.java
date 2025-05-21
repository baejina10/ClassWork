package basic.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) throws IOException {
	/*	
	 * try문을 이용해서 코드 작성
		FileWriter fw = null;
		try {
			//파일읽기
			FileReader fr = new FileReader("src/basic/io/FileReaderTest.java");
			//파일쓰기
			fw = new FileWriter("src/datafile/output3.txt");
			while(true) {
				int data = fr.read();
				if(data==-1) {
					break;
				}
				System.out.print((char)data);// 화면에 출력되게 하는 코드
				fw.write(data);//읽은 파일을 output3에 들어가게 하려면 파일 쓰는 코드를 이용해서 파일에 들어가게 해야한다
			}
			
		}catch (FileNotFoundException e) {
			System.out.println("해당파일없음");
		}catch (IOException e) {
			System.out.println("파일오류");
		} finally {
			try {
				if(fw!=null) fw.close();
			}catch (IOException e) {
			
			}
		}
		*/
		//메인 메소드에 throws 해서 사용할 코드
		//파일오픈
		FileReader fr = new FileReader("src/basic/io/FileReaderTest.java");
		FileWriter fw = new FileWriter("src/datafile/output3.txt");
		//파일액세스
		int data = 0;//read메소드의 실행결과 저장할 변수
		int count = 0;
		long startTime = System.nanoTime();
		while((data=fr.read())!=-1) {
			fw.write(data);
			System.out.print((char)data);
			count++;
		}
		
		long endTime = System.nanoTime();
		System.out.println("실행횟수=>"+count);
		System.out.println("실행시간=>"+(endTime-startTime));
		//파일닫기
		fr.close();
		fw.close();
		

	}

}
