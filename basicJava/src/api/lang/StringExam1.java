package api.lang;

import java.util.Scanner;

public class StringExam1 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("문자열입력:");
		//next메소드는 spacebar나 enter를 만나기 전까지의 문자열만 읽어서 리턴
		//한줄 전체를 읽고 싶은 경우
		String data = key.nextLine();
		System.out.println("입력받은 문자열:"+data);
		
		//미션
		//입력받은 문자열을 대문자로 변경하여 거꾸로 출력하세요
		//ex) java를 입력받은 경우
		//    AVAJ
		//힌트) 문자열조작이 들어가야 하므로 for문과 함께 사용하기
		
		data = data.toUpperCase();
		//마지막 index부터 액세스하기 위해서
		int size = data.length()-1;
		String str ="";
		for(int i=size;i>=0;i--) {
			str = str+data.charAt(i);
			System.out.print(data.charAt(i));
		}
		System.out.println();
		System.out.println(str);
		 
	}

}
