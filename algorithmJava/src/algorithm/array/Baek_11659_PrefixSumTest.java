package algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//PrefixSum(구간합)알고리즘 이용
public class Baek_11659_PrefixSumTest {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String firstline = br.readLine();

		String[] fstlineArr = firstline.split(" ");
		int numCount = Integer.parseInt(fstlineArr[0]);//탐색할 숫자의 갯수
		int runCount = Integer.parseInt(fstlineArr[1]);//구간합을 구해야하는 갯수
		
		String secondline = br.readLine();
		String[] numArr = secondline.split(" ");
		//각 배열의 구간에 대한 합을 미리 계산해놓고 작업하자
		//=> 각 구간에 대한 누적합을 배열에 저장하기
		//1) 각 구간에 대한 합을 저장할 수 있도록 배열을 만들고 가간합을 저장(o(n))
		int[] sumArray = new int[numCount+1];
		for(int j=1;j<=numCount;j++) {
			sumArray[j] =sumArray[j-1]+Integer.parseInt(numArr[j-1]);
		}
//		System.out.println(Arrays.toString(sumArray)); - 배열을 한번에 확인하는 방법
		
		for(int i=1;i<=runCount;i++) { //구간합을 3번 구할 수 있도록 실행
			//runCount만큼 명령 라인을 읽어서 구간합을 구하도록 내부에 구현
			String datasumline = br.readLine();
			String[] datasumlineArr = datasumline.split(" ");
			int start = Integer.parseInt(datasumlineArr[0]);
			int end = Integer.parseInt(datasumlineArr[1]);
			
			//구간사이의 값을 반복해서 액세스하며 계산하기 않고 구간합 저장된 구간합배열에서 값을 꺼내서 구간합을 계산
			System.out.println(sumArray[end]-sumArray[start-1]);
			
		}

	}

}
