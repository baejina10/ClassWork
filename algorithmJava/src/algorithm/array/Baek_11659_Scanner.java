package algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// 구간 합 구하기 4
public class Baek_11659_Scanner {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner key = new Scanner(System.in);
		int num1 = key.nextInt();//배열의 갯수
		int num2 = key.nextInt();//구간 합
		int[] numArr = new int[num1];
		for(int i=0;i<num1;i++) {
			numArr[i] = key.nextInt();
			System.out.println(numArr[i]);
		}
	
		
	}

}
