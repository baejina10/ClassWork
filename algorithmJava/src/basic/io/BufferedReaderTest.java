package basic.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * BufferedReader
 * 추가기능을 제공하는 IO클래스
 * => 입출력 작업의 효율을 높이기 위해서 읽은 데이터를 임시로 저장할 수 있는 버퍼라는 내부 저장소가 존대
 * => 읽은 내용을 버퍼에 넣고 한 번에 처리하는 기능을 제공한다.
 * => BufferedReader만 사용해서 파일에 쓰여진 데이터를 읽을 수 없으므로
 *    항상 FileReader와 함께 사용한다.
 */
public class BufferedReaderTest {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br =null;
		try {
			//fr = new FileReader("src/datafile/test.txt");
			//br = new BufferedReader(fr);//FileReader를 이용해서 BufferedReader를 생성
			br = new BufferedReader(new FileReader("src/datafile/test.txt"));
			while(true) {
				String line = br.readLine();
				if(line==null) {//read메소드는 ASCII를 봔환하므로 읽을 내용이 없으면 -1을 반환하지만
								//ReadLine은 한 줄 텍스트를 읽어서 String으로 반환하므로 읽을 내용이 없으면
					            //null을 리턴
					break;
					
				}
				System.out.println(line);
			}
		} catch (IOException e) {
			 e.printStackTrace();
		}
	}

}
