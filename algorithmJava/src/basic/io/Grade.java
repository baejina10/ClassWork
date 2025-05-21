package basic.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Grade {

	public static void main(String args[]) { 
		
		Grade grade = new Grade();
		
		String fileName = "src/datafile/score.txt";
		grade.printGrade(fileName);
		
	}
		
	public void printGrade(String fileName) {
		
		/* 이곳에 프로그램을 완성하십시오. */ 
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			int total = 0;//총점이 저장될 변수
			int count = 0;
			while(true) {
				String line = br.readLine();
				if(line==null) {
					break;
				}
				//파일에서 읽은 문자열을 처리하는 코드는 if문 아래 위치
				String[] data = line.split(",");
				count++;
				total = total + Integer.parseInt(data[1]);
				System.out.println(data[0]+"의 점수는 "+data[1]+"점 입니다.");
			}
			System.out.println("모두의 총점은 "+total+"점 입니다.");
			System.out.println("모두의 평균은 "+(total/count)+"점 입니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} 
	
}