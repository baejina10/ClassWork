package basic.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//BufferedReader를 이용해서 파일복사
public class FileCopy_BufferedReader {
	public static void main(String[] args) throws IOException {
		//파일오픈
		BufferedReader br = new BufferedReader(new FileReader("src/basic/io/FileReaderTest.java"));
		FileWriter fw = new FileWriter("src/datafile/output3.txt");
		//파일액세스
		
		String data = "";//read메소드의 실행결과 저장할 변수
		int count = 0;
		long startTime = System.nanoTime();
		while((data=br.readLine())!=null) {
			fw.write(data);
			//System.out.println(data);
			count++;
		}
		long endTime = System.nanoTime();
		System.out.println("실행횟수=>"+count);
		System.out.println("실행시간=>"+(endTime-startTime));
		//파일닫기
		br.close();
		fw.close();
		

	}

}
