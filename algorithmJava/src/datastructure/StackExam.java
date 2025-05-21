package datastructure;

import java.util.Arrays;
import java.util.Stack;

public class StackExam {
	public static void main(String[] args) {
		int[] myarr = {10,20,30,40};
		//Stack에 배열의 모든 요소를 옮겨담기
		Stack<Integer> staArr = new Stack<Integer>();
		for(int i=0;i<myarr.length;i++) {
			staArr.push(myarr[i]);
		}
		
//		for(int data:myarr) {
//			staArr.push(data);
//		}
		System.out.println(staArr); // stack은 vector 자식 클래스라 객체 내용이 바로 보인다.
		
		//while문
		/*
		while(!staArr.empty()) {
			System.out.println(staArr.pop());
		}
		*/
		
		//Stack에 저장된 모든 요소를 빼서 출력하세요.
		int size = staArr.size(); //=> 이걸 안하면 staArr.size()가 for문을 돌면서 staArr.size()도 변경되어서 값이 이상하게 나온다. 그래서 변수로 따로 담아서 고정을 시킨다
		for(int j=1;j<=staArr.size();j++) {
			staArr.pop();
		}
		System.out.println("stack에 저장된 요소의 갯수=> "+staArr.size());
		System.out.println("stack에 저장된 요소가 없니?"+staArr.empty());
		
		
	}

}
