package chap02;

//import java.util.ArrayList;
//ctrl+shift+o => 자동 import
//ctrl+/=> 한줄주석 설정 및 해제
import java.util.Random;

public class APIExam2 {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
		Random rand = new Random();
		int count = rand.nextInt();
		System.out.println("랜덤수=>"+count);
		
		count = rand.nextInt(10)+1;
		System.out.println("랜덤수=>"+count);
		
		
	}

}
