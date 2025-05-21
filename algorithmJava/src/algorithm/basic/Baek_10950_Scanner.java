package algorithm.basic;

import java.util.Scanner;

/*
 * 1. 테스트케이스의 갯수가 정해진 경우
 * 2. scanner이용
 */
public class Baek_10950_Scanner {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int T = key.nextInt();// 테스트 케이스의 갯수를 담을 변수
		
		for(int i=1;i<=T;i++) {
			System.out.println(key.nextInt()+key.nextInt());
		}
		
	}

}

