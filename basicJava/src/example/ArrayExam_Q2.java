package example;

public class ArrayExam_Q2 {

	public static void main(String[] args) {
		//2. 문자 배열 char[] arr = {'a', 'b', 'c', 'a', 'a'};에서 'a'의 개수를 세어 출력하세요.
		
		char[] arr = new char[] {'a','b','c','a','a'};
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]=='a') {
				count++;
			}
			
		}
		System.out.println("\'a\'의 개수: "+count);
	}

}
