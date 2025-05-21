package chap05;
//배열의 사용 - for문을 이용해서 작업하기
public class ArrayTest3 {

	public static void main(String[] args) {
		int[] myarr = new int[70];
		myarr[0] = 1000;
		myarr[1] = 2000;
		myarr[2] = 3000;
		System.out.println("0번요소=>"+myarr[0]);
		System.out.println("1번요소=>"+myarr[1]);
		System.out.println("2번요소=>"+myarr[2]);
//		System.out.println("3번요소=>"+myarr[3]);
		System.out.println("======================================");
		//코드를 최적화
		for(int i=0;i<myarr.length;i++) {
			myarr[i]=10;	
		}
		
		System.out.println("배열의 요소의 갯수=>"+myarr.length);
	}

}
