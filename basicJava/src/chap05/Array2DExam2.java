package chap05;
//{90,89,100} 과 {98,89,97}를 이용해서 2차원배열을 생성하고 출력형식처럼 출력하기
public class Array2DExam2 {

	public static void main(String[] args) {
		
		int[][] score = {{90,89,100},{98,89,97}};
		//단,classArr와 score 연관성이 있으므로 classArr의 요소 갯수와 score의 바깥쪽 요소의 갯수가 동일해야한다.
		String[] classArr = {"A반","B반"};
		//외부for는 반의 갯수만큼 실행
		//내부for는 각 반의 학생의 인원수만큼 실행
		//=>내부for의 실행이 완료되면 한 반의 점수가 모두 엑세스
		/* 문제2
		int sum = 0;
		for(int k=0;k<score.length;k++) {
			sum = 0;
			for(int i=0;i<score[k].length;i++) {
				sum = sum + score[k][i];
			}
			//한반에 대한 작업이 모두 완료
			System.out.println("["+classArr[k]+"]");
			System.out.println("합계:"+sum);
			System.out.println("평균:"+((double)sum/score[k].length));
			System.out.println("------------------------------------");
			
		}
		*/	
		//문제1
		int sum = 0;
		for(int k=0;k<score.length;k++) {
			sum = 0;
			System.out.print(classArr[k]+":");
			for(int i=0;i<score[k].length;i++) {
				sum = sum + score[k][i];
				System.out.print(score[k][i]+"\t");
			}
			//한반에 대한 작업이 모두 완료
			
			System.out.print("합계:"+sum+"\t");
			System.out.print("평균:"+(sum/score[k].length)+"\t");
			System.out.println();
		}
		

	}

}
