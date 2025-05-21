package example;
//int[] scores = {95, 100, 78, 85, 60}; 
//최고 점수와 최저 점수의 차이를 출력하세요.
public class ArrayExam_Q6 {

	public static void main(String[] args) {
		int[] score = {95,100,78,85,60};
		int max = 0;
		int min = 0;
		for(int i=0;i<score.length;i++) {
			if(score[i]>max) {
				max=score[i];
				min=score[i];
			} else if(score[i]<min) {
				min=score[i];  
			}
		}
		System.out.println("점수 차이: "+(max-min));

	}

}
