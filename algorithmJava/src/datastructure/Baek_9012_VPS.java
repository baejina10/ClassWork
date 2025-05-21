package datastructure;
/*
 * 1. 열린 괄호 (와 닫힌 괄호 )의 갯수가 같아야 함
 * 2. 가장 나중에 열린 괄호가 가장 먼저 닫혀야 한다.(LIFO구조)
 * 3. 문자열을 왼쪽에서 오른쪽으로 읽을 때 어느 시점에서도 닫힌 괄호의 갯수가 열린 괄호보다 많아지면 안된다.
 * 4. test데이터에서 읽은 문자열을 스택에 넣고 잡업
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baek_9012_VPS {
	//VPS체크하는 메소드
	public static String checkVPS(String inputdata) {
		// (())())
		String result = "YES";
		Stack<Character> stack = new Stack<Character>();
		for(char c : inputdata.toCharArray()) {
			if(c=='(') {//열린괄호
				stack.push(c);
			} else {
				//empty체크를 하고 pop
				if(stack.empty()) {
					result = "NO";
				} else {
					stack.pop();
				}
			}
		}
		//작업이 모두 완료된 상태에서 스택에 괄호가 남아있으면 오류상황
		if(!stack.empty()) {
			result = "NO";
		}
		return result;
				
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int countNum = Integer.parseInt(br.readLine()); //몇번 반복할지 숫자 변수
		for(int i=1;i<=countNum;i++) {
			System.out.println(checkVPS(br.readLine()));
		}
		
	}

}
