package string;
/*
 * 입력데이터 읽기
 */
import java.util.Scanner;

//영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 
//대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
public class Baek_2744_String {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String line = key.nextLine();
		String result = "";
		int size = line.length();
		for(int i=0;i<size;i++) {
			char data = line.charAt(i);
			if(Character.isLowerCase(data)) {
				//소문자
				result = result+Character.toUpperCase(data);
			} else {
				//대문자
				result = result+Character.toLowerCase(data);
			}
		
		}
		System.out.println(result);

	}

}
