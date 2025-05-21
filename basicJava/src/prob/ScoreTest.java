package prob;


class Score{
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	public Score() {//기본생성자
		
	}
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = (double)total/3;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void print() { //이름,국어,영어,수학,평균을 출력하는 메소드
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg);
	}
}

public class ScoreTest{
   public static void main(String []args){
      int totalScore = 0;
      Score s1 = new Score("홍길동", 10, 20, 30);
     
      
      Score s2 = new Score("김자바", 50, 40, 60);
      
     
      Score s3 = new Score("이디비", 70, 100, 50);
      
      System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

      s1.print();
      s2.print();
      s3.print();
      
      int korTotal = s1.getKor()+s2.getKor()+s3.getKor();
      int engTotal = s1.getEng()+s2.getEng()+s3.getEng();
      int mathTotal = s1.getMath()+s2.getMath()+s3.getMath();
      System.out.print("총  계\t");
    //총계용 국어, 영어, 수학, 총점, 평균값을 계산하여 출력되도록
    //이곳을 완성하시오.
      
   }
}