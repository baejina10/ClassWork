package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAPITest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		//큐에 데이터를 저장하기
		System.out.println(queue.add(1));//실행완료 - true, 작업이 처리되지 않으면 Exception이 발생
		System.out.println(queue.add(2));//실행완료 - true, 작업이 처리되지 않으면 false가 반환
		queue.offer(3);
		queue.offer(4);
		System.out.println("사이즈=>"+queue.size());
		System.out.println(queue.peek());
		System.out.println(queue.isEmpty());
		
		//데이터꺼내기
		System.out.println(queue.poll());//꺼낸 데이터를 리턴
		System.out.println(queue.remove());
		System.out.println("사이즈=>"+queue.size());
		
		System.out.println(queue.poll());//꺼낸 데이터를 리턴
		System.out.println(queue.remove());
		System.out.println("사이즈=>"+queue.size());
		
		System.out.println(queue.poll());//front의 요소를 꺼내고 결과를 출력(비어있으면 null을 리턴)
		//System.out.println(queue.remove());//front의 요소를 꺼내고 결과를 출력(비어있으면 Exception 발생)
	}

}
