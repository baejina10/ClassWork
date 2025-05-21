package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class MyQueue {//메소드
	Queue<Integer> queue = new LinkedList<Integer>();
	private int last; // push에서 정수를 넣는데 그 마지막 값을 담는 변수
	public MyQueue() {//생성자
		
	}
	public void push(int data) {
		queue.add(data);
		last = data;
	}
	public int pop() {
		int result = 0;
		if(queue.isEmpty()) {
			result = -1;
		} else {
			result = queue.poll();
		}
		return result;
	}
	public int size() {
		int result = queue.size();
		return result;
	}
	public int empty() {
		int result = 0;
		if(queue.isEmpty()) {
			result = 1;
		} else {
			result = 0;
		}
		return result;
	}
	public int front() {
		int result = 0;
		if(queue.isEmpty()) {
			result = -1;
		} else {
			result = queue.peek();
		}
		return result;
	}
	public int back() {
		int result = 0;
		if(queue.isEmpty()) {
			result = -1;
		} else {
			result = last;
//			while(queue.size()>0) {
//				result = queue.poll();
//			} => 마지막 값을 구할 수 있지만 poll은 정수 값을 제거하며 그 정수 값을 반환하는 메소드이여서
//               마지막 정수값만 출력하라는 back의 문구와는 맞지 않는다.	
			/**
			 * Queue는 선입선출이기 때문에 아주 단순히 Push를 해줄 때마다 값을 저장해주면
			 * 마지막값으로 저장된다는 생각을 갖고 'last' 라는 변수를 통해 마지막값을 저장한다.
			 */
		}
		return result;
	}
	
}

public class Baek_10845_Queue {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		MyQueue que = new MyQueue();
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=count;i++) {
			
			String line = br.readLine();
			String[] secondLine = line.split(" ");
			
			switch (secondLine[0]){
				case "push": {
					que.push(Integer.parseInt(secondLine[1]));
					break;
				}
				case "pop": {
					sb.append(que.pop()+"\n");
					break;
				}
				case "size": {
					sb.append(que.size()+"\n");
					break;
				}
				case "empty": {
					sb.append(que.empty()+"\n");
					break;
				}
				case "front": {
					sb.append(que.front()+"\n");
					break;
				}
				case "back": {
					sb.append(que.back()+"\n");
					break;
				}
			
			}
		}
		System.out.println(sb.toString());
		
	}

}
