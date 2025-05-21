package chap04;

public class ForExam1 {

	public static void main(String[] args) {
		for(int i=10;i>=1;i--) {
			System.out.println("자바프로그래밍=>"+i);
		}
		System.out.println("==========================");
		int count = 10;
		for(int i=1;i<=10;i++) {
			System.out.println("자바프로그래밍=>"+count);
			count -= 1; //대입연산자 활용 //count =count-1;//count--;
		}
	}

}
