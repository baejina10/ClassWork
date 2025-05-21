package algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// 구간 합 구하기 4
public class Baek_11659_NoPrefixSumTest {
	public static void main(String[] args) throws IOException {
		/**
		 * 1. BufferedReader를 생성(BufferedReaderTest.java참고)
		 * 2. 입력값을 첫 번째 라인을 읽기
		 *   - readLine을 이용해서 첫 줄을 읽기
		 *   - 입력값을 띄어쓰기를 기준으로 나누기(StringTest5.java 참고)
		 * 3. 입력값의 두 번째 라인을 읽기
		 *   - 띄어쓰기를 기준으로 분리해서 배열에 저장
		 * 4. 2번에서 띄어쓰기를 기준으로 나눈 수 중 2번째 숫자를 실행횟수로 처리하는
		 *    for문을 정의하고 작업
		 * 5. 실행횟수만큼 입력값을 읽어서
		 *    3번에서 저장한 배열의 구간합을 구해서 sysout으로 출력
		 * 
		 */
		//PrefixSum알고리즘을 사용하지 않는 경우
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String firstline = br.readLine();

		String[] fstlineArr = firstline.split(" ");
		int numCount = Integer.parseInt(fstlineArr[0]);//탐색할 숫자의 갯수
		int runCount = Integer.parseInt(fstlineArr[1]);//구간합을 구해야하는 갯수
		
		String secondline = br.readLine();
		String[] numArr = secondline.split(" ");

		for(int i=1;i<=runCount;i++) { //구간합을 3번 구할 수 있도록 실행
			//runCount만큼 명령 라인을 읽어서 구간합을 구하도록 내부에 구현
			String datasumline = br.readLine();
			String[] datasumlineArr = datasumline.split(" ");
			int start = Integer.parseInt(datasumlineArr[0]);
			int end = Integer.parseInt(datasumlineArr[1]);
			int sum = 0;//구간합을 저장할 변수
			//start와 end 사이의 숫자들의 합을 계산하기 - 구간 합
			for(int j=start-1;j<end;j++) {
				sum = sum + Integer.parseInt(numArr[j]);
			}
			System.out.println(sum);
		}
		
	}

}
