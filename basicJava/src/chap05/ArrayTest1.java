package chap05;
public class ArrayTest1 {

	public static void main(String[] args) {
		//1. 배열을 선언
		//=> int형 배열을 참조하는 참조변수 myarr를 정의(선언)
		int[] myarr;
		
		//2. 배열의 생성
		//=> 실제 데이터를 저장할 수 있는 구조를 메모리에 만드는 과정
		//=> 생성된 배열은 힙에 할당된다.
		myarr = new int[5];
		System.out.println(myarr);
		
		int[] myarr2 = new int[5];
		System.out.println(myarr2);
		
		//배열의 선언과 생성을 한 번에 작업하기
		//=> String객체 3개를 저장할 수 있는 배열객체를 입에 만들고 strArr변수가 참조
		String[] strArr = new String[3];
		System.out.println(strArr);
		
		//3. 배열의 초기화
		//   - 생성되는 배열의 요소는 초기값을 가지고 있다
		//   - 정수:0, 실수:0.0, boolean:false, 참조형:null
		//   - 내가 원하는 값을배열의 요소에 저장하기 위해
		//     배열참조변수[index] = 값
		myarr[1] = 100;
		
		//4. 배열의 각 요소에 저장된 값을 액세스하기
		System.out.println("0번요소의 값:"+myarr[0]);
		System.out.println("1번요소의 값:"+myarr[1]);
		System.out.println("2번요소의 값:"+myarr[2]);
		System.out.println("3번요소의 값:"+myarr[3]);
		System.out.println("4번요소의 값:"+myarr[4]);
		
		
		
	}

}
