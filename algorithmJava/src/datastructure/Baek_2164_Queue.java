package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Baek_2164_Queue {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cardNum = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<Integer>();
		//1부터 n까지를 큐에 저장
		for(int i=1;i<=cardNum;i++) {
			queue.add(i);
		}
		//System.out.println(Arrays.toString(queue.toArray())); //=> Queue를 배열로 변경하는 코드
		
		//카드를 버리고 앞에 있는 카드를 밑으로 옮기는 과정을 반복하는 코드
		while(queue.size()>1) { // 한 장 남을때까지 반복작업
			queue.remove();//맨위의 카드는 버리고
			int data = queue.poll();
			queue.offer(data);//두 번째 카드는 빼서 다시 add
			
		}
		System.out.println(queue.peek());
		

	}

}
