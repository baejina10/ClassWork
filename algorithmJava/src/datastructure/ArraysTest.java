package datastructure;

import java.util.Arrays;

//배열을 관리하기 위해서 필요한 기능을 제공하는 클래스 -Arrays
public class ArraysTest {
	public static void main(String[] args) {
		int[] myarr = {100,20,40,88,99,78};
		int[] myarr2 = myarr;//얕은복사
		int[] myarr3 = myarr.clone();//깊은복사 - 독립적인 배열으 생성
		System.out.println(myarr);
		System.out.println(myarr2);
		System.out.println(myarr3);
		myarr3[2] = 70;
		System.out.println("myarr=>"+Arrays.toString(myarr));
		System.out.println("myarr3=>"+Arrays.toString(myarr3));
		//배열의 값을 비교
		System.out.println(Arrays.equals(myarr, myarr3));
		System.out.println(Arrays.equals(myarr, myarr2));
		//지정한 index사이의 배열요소를 복사해서 새로운 배열로 리턴
		int[] otherArr = Arrays.copyOfRange(myarr3, 1, 4);
		System.out.println("otherArr=>"+Arrays.toString(otherArr));
		
		//배열정렬하기
		Arrays.sort(myarr);//오름차순 정렬하기
		System.out.println("myarr=>"+Arrays.toString(myarr));
		
		//배열에서 특정 값 검색하기
		//binarySearch는 내부적으로 이진 검색 알고리즘을 이용해서 처리
		//=> 이진검색알고리즘을 내부에서 사용하므로 사용전에 정렬이 되어 있어야 제대로 동작한다.
		System.out.println(Arrays.binarySearch(myarr, 78));
		
	}

}
