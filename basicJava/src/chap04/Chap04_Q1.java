package chap04;

import java.util.Random;

public class Chap04_Q1 {

	public static void main(String[] args) {
		
		Random key = new Random();
		while(true) {
			int dice1 = key.nextInt(5)+1;
			int dice2 = key.nextInt(5)+1;
			System.out.println("("+dice1+","+dice2+")");
			int sum = dice1+dice2;
			if(sum==5) {
				break;
			}
		} 
		
	}

}
