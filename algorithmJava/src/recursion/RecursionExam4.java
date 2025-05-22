package recursion;
//n부터 1까지 합
public class RecursionExam4 {
	public static int sum(int num) {
		if(num==0) {
			return 0;
		}else {
			return num+sum(num-1);
		}
	}
	public static void main(String[] args) {
		System.out.println("합:"+sum(10));//합:55
	}

}
