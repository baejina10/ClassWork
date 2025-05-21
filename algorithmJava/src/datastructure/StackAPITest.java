package datastructure;

import java.util.Stack;

/*
 * java에서 제공되는 stack API
 */
public class StackAPITest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		//stack에 데이터 저장
		stack.push("java");
		stack.push("python");
		stack.push("javascript");
		stack.push("spring");
		
		System.out.println("stack에 저장된 요소의 갯수=> "+stack.size());
		//stack에 저장된 요소가 없으면 true리턴
		System.out.println("stack에 저장된 요소가 없니?"+stack.empty());
		System.out.println("stack에 마지막으로 저장된 요소를 확인"+stack.peek());
		System.out.println("stack에 저장된 요소의 갯수=> "+stack.size());
		
		System.out.println("stack에서 데이터꺼내기=> "+stack.pop());
		System.out.println("stack에서 데이터꺼내기=> "+stack.pop());
		System.out.println("stack에서 데이터꺼내기=> "+stack.pop());
		System.out.println("stack에서 데이터꺼내기=> "+stack.pop());
		
		System.out.println("stack에 저장된 요소의 갯수=> "+stack.size());
		System.out.println("stack에 저장된 요소가 없니?"+stack.empty());
		//System.out.println("stack에 마지막으로 저장된 요소를 확인"+stack.peek());
	}

}
