package basic.io.exam;

import java.io.FileReader;
import java.io.IOException;

//
public class FileReaderExam {
	public static void main(String[] args) {
		try {
			FileReader fi = new FileReader("src/datafile/score.txt");
			while(true) {
				int data = fi.read();
				if(data==-1) {
					break;
				}
				System.out.print((char)data);
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
