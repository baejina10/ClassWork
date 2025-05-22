package recursion;
//문자열의 길이를 구하기
public class RecursionExam1 {

	public static void main(String[] args) {
		//
		int result = length("java");
		System.out.println("문자열의 길이=>"+result);
		
	}
	public static int length(String str) {
		//재귀로 문자열의 길이를 구할 수 있도록
		//System.out.println(str.substring(1));
		if(str.equals("")) {
			return 0;
		}else {
			return 1+length(str.substring(1));
		}
		
	}

}
