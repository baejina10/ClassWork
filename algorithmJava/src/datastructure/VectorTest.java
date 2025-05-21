package datastructure;

import java.util.Vector;

/*
 * List - 선형구조
 * 순차적으로 데이터를 접근
 * 중복허용
 * Vector는 동시접속에 대한 처리가 되어 있으므로 웹에서는 사용하지 않고
 * 주로 swing같은 GUI프로그램에서 많이 사용된다.
 */
public class VectorTest {
	//1. Vector생성
	//<>안에 정의한 타입은 Vector에 저장되는 요소의 타입
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();//int[] arr =new int[10]
 		//v.add("java");
		//2. Vector에 데이터를 저장하기
		v.add(10); //arr[0] = 10;
		//3. Vector에 저장된 요소의 갯수 확인
		System.out.println("현재 벡터에 저장된 요소의 객수=>"+v.size()); //arr.length
		System.out.println("현재 벡터의 용량=>"+v.capacity());
		
		for(int i=1;i<=10;i++) {
			v.add(i);
		}
		System.out.println("현재 벡터에 저장된 요소의 객수=>"+v.size()); //arr.length
		System.out.println("현재 벡터의 용량=>"+v.capacity());
		
		//4. Vector에 저장된 요소를 꺼내기 - 요소번호0번
		System.out.println("0번 index번째 저장된 요소는 =>"+v.get(0)); //sysout(arr[0])
		
		//5. Vector에 저장된 모든 요소를 꺼내기
		for(int i=0;i<v.size();i++) {
			int data = v.get(i);
			System.out.println(i+"번째 요소=>"+data);
		}
		System.out.println("===========================");
		for(int data:v) {
			System.out.println(data);
		}
		
		
	}
	

}
