package api.lang;
//데이터의 변환
public class StringTest5 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("java mysql linux html5 css");
		
		//1. String -> byte[]
		byte[] arr1 = str1.getBytes(); //문자열의 문자 하나를 ASCII로 변환해서 배열에 담아 리턴
		for(byte b : arr1) {
			System.out.println(b);
		}
		System.out.println("---------------------");
		//2. String -> char[]
		char[] arr2 = str1.toCharArray();
		for(char c : arr2) {
			System.out.println(c);
		}
		System.out.println("---------------------");
		
		//3. String -> String[]
		//특정 기호를 기준으로 잘라서 배열에 담아 리턴
		String[] arr3 = str2.split(" ");
		for(String s : arr3) {
			System.out.println(s);
		}
		System.out.println("---------------------");
		//4. 기본형데이터 -> String
		String data = String.valueOf(100);
		data = String.valueOf(100.123);
		data = 100+"";
		data = 10.5+"";
		
		
		
		
	}

}
