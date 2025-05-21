package chap05;

import java.util.Random;

//참조형배열
//기본형배열은 배열의 요소에 값이 저장된다.
//참조형배열은 배열의 요소에 객체의 주소가 저장된다.
public class ArrayTest5 {

	public static void main(String[] args) {
		String str1 = new String("java");
		String str2 = new String("servlet");
		String str3 = new String("spring");
		String[] strArr = new String[4];
		strArr[0] = str1;
		strArr[1] = str2;
		strArr[2] = str3;
		strArr[3] = new String("android");
		for(String data:strArr) {
			System.out.println(data);
		}
		System.out.println("---------------------------");
		String[] strArr2 = {"java","servlet","spring"};
		for(String data:strArr2) {
			System.out.println(data);
		}
		System.out.println("---------------------------");
		Random[] randArr = new Random[3];
		randArr[0] = new Random();	
		randArr[1] = new Random();	
		randArr[2] = new Random();	
		for(Random data:randArr) {
			System.out.println(data);
		}
		

		
	}

}
