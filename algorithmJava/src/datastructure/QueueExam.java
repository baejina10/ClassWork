package datastructure;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//Queue의 API연습
public class QueueExam {

	public static void main(String[] args) {
		//1번부터 10번까지 큐에 추가
		//큐에 있는 데이터를 배열로 변환해서 출력하기
		//                         -------
		//                          배열데이터를 출력
		
		Queue<Integer> queue = new LinkedList<Integer>();

		for(int i=1;i<=10;i++) {
			queue.add(i);
		}
		//배열에 넣기
		int size = queue.size();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = queue.poll();
		}
		System.out.println(Arrays.toString(arr));
	}

}
