package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * src1.txt파일과 src2.txt파일을 비교해서 대소문자가 정확하게 일치하는 문자열만 ArrayList에 담아서 리턴하는
 * compareFile메소드를 구현하기
 * [메소드에서 작업]
 * 1. BufferedReader와 FileReader를 이용해서 src1.txt파일과 src2.txt파일을 읽기 - 출력해보기
 * 2. 읽은 각각의 내용을 문자열비교하기
 * 3. 문자열이 대소문자까지 일치하면  ArryList에 저장하기
 * 
 * [main메소드작업]
 * compareFile을 호출하고 받은 ArryList의 내용을 출력하기
 * 
 * => main메소드에서 작업해보기
 */
public class Exam2 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> arrList = compareFile("src/datafile/src1.txt", "src/datafile/src2.txt");
		for (String data:arrList) {
			System.out.println(data);
		}
		
	}
	public static ArrayList<String> compareFile(String file1,String file2) throws IOException,NullPointerException {
		BufferedReader br1 = new BufferedReader(new FileReader(file1));
		BufferedReader br2 = new BufferedReader(new FileReader(file2));
		ArrayList<String> arrList = new ArrayList<String>();
		int count=0;
		//src1.txt파일과 src2.txt파일을 읽기
		while (true) {
			String line1 = br1.readLine();
			String line2 = br2.readLine();
			if (line1 == null) {
				break;
			}
			if (line1.equals(line2)) {// 왜 여기에 이 코드가 와야 하는지 모르겠습니다...
				//ArryList에 저장하는 코드 작성해보기
					arrList.add(line1);
				}
			
		}
		return arrList;
	}
}
//강사님! 금요일 exam2 문제 풀긴 했는데 약간 이해가 안가서요!
//readLine이 한 줄씩 나오게 하는거라고 했던걸로 기억하는데
//그럼 line1,2에 src1,2 각각 한 줄씩 들어가는거고
//그러면 읽은 각각의 내용이 같을때 ArryList에 한 인덱스?에 그 문장이 들어가야하는데
//그럼 (제가 보내준 코드에 42번째)가 String line2 = br2.readLine(); 뒤에 와야 하는거 아닌가요?
// if (line1.equals(line2)) {
//	//ArryList에 저장하는 코드 작성해보기
//		arrList.add(line1);
//	}
//왜 break 뒤에 오는건가요?
//}
