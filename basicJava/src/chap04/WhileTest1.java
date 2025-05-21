package chap04;
//
public class WhileTest1 {

	public static void main(String[] args) {
		//"자바프로그래밍"을 10번 출력하기
		
		int i = 1; //카운터변수
		while(i<=10) {
			System.out.println("자바프로그래밍");
			//카운터변수가 변경될 수 있도록 작업
			i++;
		}
		System.out.println();
		i=1;
		while(true) {
			System.out.println("자바프로그램");
			if(i==5) {
				break;
			}
			i++;
		}
		

	}

	
}
