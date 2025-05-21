package string;

import java.util.Scanner;

//for문과 스트링 메소드를 사용해서 해야한다.
//int 타입의 indexOf(String str):문자열 내에서 주어진 문자열의 위치를 리턴합니다.
//string 타입의 substring(int beginIndex):beginIndex 위치에서 끝까지 잘라낸 새로운 문자열을 리턴합니다.
//boolean 타입의 contains(CharSequence s): 대상 문자열에 특정 문자열이 포함되어 있는지 확인하는 함수이다.
public class Baek_1543_String_API {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String readData = key.nextLine();//읽으려는 변수
		String foundData = key.nextLine();//찾고자 하는 변수
		//강사님
		int count = 0;
		int startIndex = 0;
		while(true) {
			int findIndex = readData.indexOf(foundData, startIndex);
			if(findIndex<0) {
				break;
			}
			startIndex = findIndex + foundData.length();
			count++;
		}
		
		
//		int count = 0;
//		int index = 0;
//		while(readData.contains(foundData)){
//			index = readData.indexOf(foundData);
//			readData = readData.substring(index+foundData.length());
//			count++;
//		}
		
		System.out.println(count);
		

	}

}
