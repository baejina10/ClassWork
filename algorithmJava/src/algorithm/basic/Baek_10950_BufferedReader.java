package algorithm.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1. 테스트케이스의 갯수가 정해진 경우
 * 2. BufferedReader로 작업하기
 */
public class Baek_10950_BufferedReader {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//입력데이터를 읽기 위해서 BufferedReader API를 생성
		BufferedReader br = new BufferedReader(
									new InputStreamReader(System.in));
		
		//한 줄을 읽고 숫자로 활용하기 위해서 int데이터로 변화	
		int t = Integer.parseInt(br.readLine());
		for(int i=1;i<=t;i++) {
			//실행횟수만큼 반복해서 주어진 input데이터를 읽기 -두 번쩨 라인부터 읽기
			//한 줄 읽은 문자열 라인을 띄어쓰기를 기준으로 데이터를 분리
//			String line = br.readLine();
//			String[] lineArr = line.split(" ");
			//한 줄 읽은 문자열을 바로 띄어쓰기를 기준으로 분리하는 작업을 바로 처리
			//메소드체이닝
			String[] line = br.readLine().split(" ");
			System.out.println(Integer.parseInt(line[0])+Integer.parseInt(line[1]));
		}
		
		
	}

}

