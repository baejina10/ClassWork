package algorithm.basic;

import java.util.Scanner;

/*
 * 1. 테스트케이스의 갯수가 정해지지 않은 경우
 *    => EOF를 체크
 * 2. scanner이용
 */
public class Baek_10951_Scanner {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		while(key.hasNextInt()) {//입력값이 숫자인지 아닌지 체크 - 숫자이면 true
			//spacebar나 엔터키를 기준으로 입력된 두 개의 숫자를 읽어서 더하기
			System.out.println(key.nextInt()+key.nextInt());
		}
		key.close();
		
	}

}

