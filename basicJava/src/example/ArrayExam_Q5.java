package example;
//아래 배열은 학생들의 점수 배열입니다. 
//int[] scores = {85, 92, 76, 58, 99}; 
//[조건] 
//1) 총점과 평균을 출력 
//2) 60점 미만인 학생 수를 출력 
//3) 최고 점수와 해당 학생 번호(인덱스)를 출력 
//4) 90점 이상인 학생들에게 'A' 등급을 부여하여 출력

public class ArrayExam_Q5 {

	public static void main(String[] args) {
		int[] scores = {85,92,76,58,99};
		System.out.println("학생 점수 리스트:");
		int sum = 0; //총점 구하는 변수
		int count = 0;//60점 미만 수 구하는 변수
		int max = 0;
		int student = 0;
		for(int i=0;i<scores.length;i++) {
			System.out.println("학생 "+i+":"+scores[i]+"점");
			sum += scores[i];
			//60점 미만 코드
			if(scores[i]<60) {
				count++;
			}
			student=i;
			if(scores[i]>max) {
				max = scores[i];
			}
		}	
		System.out.println();
		System.out.println("총점: "+sum);
		System.out.println("평균: "+(double)(sum/scores.length));
		System.out.println("60점 미만 학생 수: "+count);
		System.out.println("최고 점수: "+max+"점"+"(학생 "+student+")");
		
		System.out.println();
		System.out.println("90점 이상 학생 등급 부여:");
		for(int row=0;row<scores.length;row++) {
			if(scores[row]>=90) {
				int studentCount = row;
				String grand = "A등급";
				int jumsu = scores[row];
				System.out.println("학생 "+studentCount+": "+grand+"("+jumsu+"점)");
			}
			
		

		}
		

	}

}
