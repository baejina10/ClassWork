package algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Baek_2003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
										new InputStreamReader(System.in));
		String firstLine = br.readLine();
		String[] firstArr = firstLine.split(" ");
		int numCount = Integer.parseInt(firstArr[0]);
		int sumNum = Integer.parseInt(firstArr[1]);

		String secondLine = br.readLine();
		String[] numArr = secondLine.split(" ");
		
		
		
		int count = 0;
		int sum = Integer.parseInt(numArr[0]);
		int startIndex = 0;
		int endIndex = 0;
		/*
		 * 현재 오류가 나오는 이유
		 * endindex가 3일때 실행되고 나서 그 다음에 다시 endIndex++ 하고 실행이 되어서 4가 되고
		 * 그 아래 더하는 값이 numArr[4]가 되어서 오류가 뜬다
		 */
		
		while(endIndex<numCount) {//endIndex가 numCount이 아닌 동안 작업
			if(sum<sumNum) {//구간의 합이 입력 받은 숫자 num보다 작은 경우
				if(endIndex==(numCount-1)) break;
				endIndex++;
				sum = sum + Integer.parseInt(numArr[endIndex]);
			} else if(sum==sumNum) {
				count++;
				if(endIndex==(numCount-1)) break;
				endIndex++;
				sum = sum + Integer.parseInt(numArr[endIndex]);// 여기서 오류
			} else { //구간의 합이 입력 받은 숫자 num보다 큰 경우
				sum = sum - Integer.parseInt(numArr[startIndex]);
				startIndex++;
			}
		}
		System.out.println(count);
		
		
	}

}
