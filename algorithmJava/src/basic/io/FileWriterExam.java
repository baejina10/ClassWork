package basic.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			//1. 파일오픈
			fw = new FileWriter("src/basic/io/gugudan.txt",true);//append
			for(int i=1;i<=9;i++) {
				//2. 파일액세스
				fw.write("9 * "+i+ " = "+ (9*i)+"\n");
			}
		} catch (IOException e) {
			System.out.println("출력오류");
		} finally {
			try {
				//3. 파일닫기
				if(fw!=null) fw.close();
			}catch (IOException e) {
				
			}
		}

	}

}
