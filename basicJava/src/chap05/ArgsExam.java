package chap05;
//명령행매개변수 5개를 입력 받아 총점과 평균을 출력
//[출력형식]
//총점 :_____
//평균 :_____
public class ArgsExam {

	public static void main(String[] args) {
		System.out.println(args.length);
		//노가다		
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int num3=Integer.parseInt(args[2]);
		int num4=Integer.parseInt(args[3]);
		int num5=Integer.parseInt(args[4]);
		int hap = num1+num2+num3+num4+num5;
		System.out.println("총점:"+hap);
		System.out.println("총점:"+(hap/5));
		
		//for문 이용
		int sum = 0;
		for(int i=0;i<args.length;i++) {
			int num =Integer.parseInt(args[i]);
			sum = sum + num;
		}
		System.out.println("총합:"+sum);
		System.out.println("평균:"+(sum/args.length));
		
	}

}
