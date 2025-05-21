package prob;

public class Student {
	private String name; //이름변수
	private String subject; //과정명
	private int fee; //교육비
	private double returnFee; //환급금
	
	public Student() {
		
	}
	public Student(String name,String subject,int fee) {
		this.name = name;
		this.subject = subject;
		this.fee = fee;
	}
	public void calcReturnFee() {
		if(subject == "javaprogram") {
			returnFee = (double)(fee*0.25);
		} else if(subject == "jspprogram") {
			returnFee = (double)(fee*0.20);
		} else {
			System.out.println("그런 과정명은 없습니다");
		}
		System.out.println(returnFee);
	}
	public void print() {
		System.out.println(name+" 씨의 과정명은 "+subject+"이고 교육비는 "+fee+"이며 환급금은 "+returnFee+"입니다.");
	}
}
