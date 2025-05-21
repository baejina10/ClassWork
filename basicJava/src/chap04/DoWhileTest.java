package chap04;

public class DoWhileTest {

	public static void main(String[] args) {
		int i = 10;
		//while문은 조건이 만족하지 않으면 블럭 안의 명령문을 실행하지 않는다.
		while(i<10) {
			System.out.println("while처리완료");
			i++;
		}
		System.out.println("다음작업");
		do {
			System.out.println("dowhile처리완료");
			i++;
		} while(i<10);

	}

}
