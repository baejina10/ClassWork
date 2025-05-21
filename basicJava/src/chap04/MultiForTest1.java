package chap04;
//for문을 중첩해서 사용하기
public class MultiForTest1 {

	public static void main(String[] args) {
		for(int row=1;row<=4;row++) {
			for(int i=1;i<=4;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
