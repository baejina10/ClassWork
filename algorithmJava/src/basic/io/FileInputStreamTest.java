package basic.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//파일로부터 읽기 - byte단위로 읽기
public class FileInputStreamTest {
	public static void main(String[] args) {
		try {
			//1. 파일오픈(OS와 통신하면서 파일리소스를 사용할 수 있도록 허가)
			//         -------------------------------------
			//            OS와 통신하거나 파일을 오픈하는 작업은 FileInputStream 생성자에 구현
			FileInputStream fi = new FileInputStream("test.txt");
			//2. 파일액세스 *액세스: 데이터를 탐색하고 읽는 과정,접근
			while(true) {
				int data = fi.read();
				//파일의 끝이 되면 즉, 더이상 읽을 내용이 없으면 -1을 리턴
				if(data==-1) {
					break;
				}
				System.out.print((char)data);
			}
			
		} catch (FileNotFoundException e) {//파일오픈할때 오류
			System.out.println("파일명이 틀렸습니다.");
		}catch (IOException e) {//파일읽기할때 오류발생
			System.out.println("파일을 읽을 수 없습니다.");
		}
		

	}

}
