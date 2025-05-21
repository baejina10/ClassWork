package chap02;
/*
 * 
 * 로컬변수(지역변수)의 특징
 *  1. 지역변수는 사용하기 전에 반드시 초기화를 해야한다
 * 
 * 
 */



public class LocalVariableTest {
	public static void main(String[] args) {
		int i=10;//로컬변수
		int num;
		System.out.println("i="+i);
		//System.out.println("num="+num);
		{
			int j = 100;
		}
		System.out.println("j="+j)
	}
}
