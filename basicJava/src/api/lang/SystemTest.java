package api.lang;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SystemTest {

	public static void main(String[] args) {
		//표준입력과 표준출력의 사용
		System.out.println(Math.PI);
		double mypi = Math.PI;
		System.out.println(mypi);
		
		InputStream myin = System.in;
		PrintStream myout = System.out;
		myout.println("정적변수를 변수에 넣고 작업할 수 있다.");
		Scanner key = new Scanner(myin);
		System.out.println("값입력:");
		int data = key.nextInt();
		System.out.println("입력한 숫자:"+data);
		long time1 = System.currentTimeMillis();//1/1000초
		long nanotime1 = System.nanoTime();//1/100000000
		for(int i=1;i<=data;i++) {
			//System.out.println("i="+i);
			if(i==10000) {
				System.exit(0);//정상적으로 시스템을 종료
			}
		}
		long time2 = System.currentTimeMillis();//1/1000초
		long nanotime2 = System.nanoTime();//1/100000000
		System.out.println(time2-time1);
		System.out.println(nanotime2-nanotime1);
	}

}
