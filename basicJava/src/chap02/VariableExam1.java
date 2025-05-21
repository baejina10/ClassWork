package chap02;
//변수를 선언라고 변수의 값을 출력하는 예제

//반드시 매소드 선언을 해줘야 한다!!!!!!
public class VariableExam1 {
	public static void main(String[] args) {
		int kor = 100;
		int math = 98;
		int eng = 98;
		int total = kor+math+eng;
		int avg = (kor+math+eng)/3;
	
		//결과 출력 선언문
	
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
	}
}
