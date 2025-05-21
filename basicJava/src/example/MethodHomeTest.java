package example;

public class MethodHomeTest {
	//1.해당수가 짝수인지 홀수인지 출력하는 메서드
	public void checkEvenOrOdd(int num) {
		if(num%2==0) {
			System.out.println(num+"은 짝수입니다.");
		} else {
			System.out.println(num+"은 홀수입니다.");
		}
	}
	//2. 숫자 2개를 전달하고 그 숫자 사이의 합을 출력하는 메서드
	public void sumBetween(int min, int max) {
		int sum=0;
		for(int i=min;i<=max;i++) {
			sum=sum+i;
		}
		System.out.println(min+"부터"+max+"까지의 합: "+sum);
	}
	//3.문자열과 정수를 전달받아 해당 문자열을 지정된 횟수만큼 줄마다 출력하는 메소드
	public void repeatString (String str,int count) {
		for(int i=1;i<=count;i++) {
			System.out.println(str);
		}
	}	
	public void checkAlphabet(char alpha) {
		 if(alpha>='A'&& alpha<='Z') {
			 System.out.println("\'"+alpha+"\'"+"는 알파펫입니다");
		} else {
			 System.out.println("\'"+alpha+"\'"+"는 알파펫이 아닙니다");
		}
	}
	//정수 1개를 전달받아, 해당 수가 1부터 100 사이에 있으면 "정상 입력"을 출력하고,
	//그 외는 "잘못된 입력"을 출력하는 메서드를 정의하세요
	public void checkRange(int key) {
		if(key>0 && key<=100) {
			System.out.println("\"정상 입력\"");
		} else {
			System.out.println("\"잘못된 입력\"");
		}
	}
}
