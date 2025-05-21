package chap04;
//알파벳을 대문자로 출력하기
//출력형식: ABCD.....Z
public class ForExam_Alpha {

	public static void main(String[] args) {
		//내 답
		for(char a='A';a<='Z';a++) {
			System.out.print(a);
		}
		System.out.println();//enter키를 누른 것과 같이 실행
		
		//강사님 답
		//명시적형변환 int -> char
		System.out.println((int)'A');
		System.out.println((int)'Z');
		for(int i=65;i<=90;i++) {
			System.out.print((char)i);
		}
		System.out.println(); //enter키를 누른 것과 같이 실행
		
		for(char c='A';c<='Z';c++) {
			System.out.print(c);
		}
	}

}
