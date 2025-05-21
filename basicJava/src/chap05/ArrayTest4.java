package chap05;
//배열의 선언과 생성관 초기화를 한 번에 작업하기
public class ArrayTest4 {

	public static void main(String[] args) {
		//타 언어에서 사용하는 방식대로 지원=> 요소를 ,로 구분해서 정의
		int[] myarr = {10,20,30,40,50};
		//자바답게 표현하기
		int[] myarr2 = new int[] {10,20,30,40,50};
		System.out.println(myarr2[2]);
		
		System.out.println("===========================");
		//클래식 for를 이용해서 배열을 액세스
		for(int i=0;i<myarr.length;i++) {
			System.out.println(myarr[i]);
		}
		System.out.println("===========================");
		//향상된 for문을 이용해서 배열을 액세스
		//data=>myarr에서 꺼낸 요소를 담을 변수(myarr의 요소 타입과 동일한 타입)
		int index=0;
		for(int data:myarr) {
			System.out.println(data+":"+myarr[index]);
			index++;
		}
	}

}
