package api.lang;

public class String_01 {
	public static void main(String[] args) {
		System.out.println("문자열에 특정문자 변경하는 테스");
		System.out.println("-------------Sample 1 --------------");
		String str1=myReplace2("hello world",'l','*');
		System.out.println(str1);
		
		System.out.println("-------------Sample 2 --------------");
		String str2=myReplace("hello world",' ','-');
		System.out.println(str2);
		
		System.out.println("-------------Sample 3 --------------");
		String str3=myReplace("hello world",'a','*');
		System.out.println(str3);
		

	}
	public static String myReplace(String str, char oldChar, char newChar){
		//2번째 방법
		char[] data = str.toCharArray();
		for(int i=0; i<data.length;i++) {
			if(data[i]==oldChar) {
				data[i]=newChar;
			}
		}
		//System.out.println(data);
		return String.valueOf(data);
	}
	public static String myReplace2(String str, char oldChar, char newChar){
		// 이 부분을 구현하시오.
		//1번째 방법
		String result = "";
		int size = str.length();
		for(int i=0;i<size;i++) {
			if(str.charAt(i)==oldChar) {
				result = result+newChar;
			} else {
				result = result + str.charAt(i);
			}
		}
		return result;

	}
	
	
}