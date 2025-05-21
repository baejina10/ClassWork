package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//mystack 내부에 데이터를 저장하기 위한 공간
class MyStack{
	private int[] mystack;
	//스택의 top의 위치값 - top_position의 변수의 값이 0이라는 것은 스택이 비어있다는 의미
	private int top_position;
	public MyStack(int size) {//생성자 - 배열 길이 초기화
		mystack = new int[size];
	}
	//push X: 정수 X를 스택에 넣는 연산이다.
	public void push(int data) {
		mystack[top_position] = data;
		top_position++;
	}
	//empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
	public int empty() {
		int result = 0;
		if(top_position==0) {
			result = 1;
		} else {
			result = 0;
		}
		return result;
	}
	//pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public int pop() {
		int result = 0;
		if(empty()==1) {//비어있다는 뜻
			result = -1;
		}else {
			top_position = top_position -1;
			result = mystack[top_position];
		}
		return result;
	}
	//size: 스택에 들어있는 정수의 개수를 출력한다.
	public int size() {
		int result = 0;
		result = top_position;
		return result;
		//return this.top_position;
	}
	//top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public int top() {
		int result = 0;
		if(top_position==0) {
			result = -1;
		} else {
			result = mystack[top_position-1];//
		}
		return result;
	}
}

public class Baek_10828_Stack {
	public static void main(String[] args) throws IOException {
		//MyStack의 메소드를 호출해서 테스트케이스 데이터를 입력 받아서 처리하면 출력결과대로 출력되도록 작업
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		//각 경우에 따라서 MyStack의 메소드를 호출
		//각 출력하는 값은 StringBulider로 만들어서 for문 밖에서  한 번에 출력
		MyStack stack = new MyStack(count);
		StringBuilder builder = new StringBuilder();
		for(int i=1;i<=count;i++) {
			String line = br.readLine();
			String[] arr = line.split(" ");
			
			switch (arr[0]) {
				case "push": {
					stack.push(Integer.parseInt(arr[1]));
					break;
				}
				case "pop": {
					builder.append(stack.pop()+"\n");
					break;
				}
				case "empty": {
					builder.append(stack.empty()+"\n");
					break;
				}
				case "size": {
					builder.append(stack.size()+"\n");
					break;
				}
				case "top": {
					builder.append(stack.top()+"\n");
					break;
				}
	
			}

		}
		System.out.println(builder.toString());
	}

}
