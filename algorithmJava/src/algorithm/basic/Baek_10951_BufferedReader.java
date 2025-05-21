package algorithm.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1. 테스트케이스의 갯수가 정해지지 않은 경우
 *    => EOF를 체크
 * 2. scanner이용
 */
public class Baek_10951_BufferedReader {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
									new InputStreamReader(System.in));
		String line = null;
		while(true) {
			line = br.readLine();
			if(line == null) {
				break;
			}
			String[] lineArr = line.split(" ");
			System.out.println(Integer.parseInt(lineArr[0]+Integer.parseInt(lineArr[1])));
		}
	}

}
