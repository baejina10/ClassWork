package api.lang;
//String클래스의 생성자
public class StringTest1 {
	public static void main(String[] args) {
		//1. String클래스
		String str = new String("java");
		System.out.println(str);
		
		byte[] data1 = {97,98,99,100} ; //ASCII
		String str2 = new String(data1);
		System.out.println(str2);
		
		//char배열로
		char[] data2 = {'j','a','v','a'} ;
		String str3 = new String(data2);
		System.out.println(str3);
		
		String str4 = new String(data2,2,2);
		System.out.println(str4);
		
		
		
	}
}
