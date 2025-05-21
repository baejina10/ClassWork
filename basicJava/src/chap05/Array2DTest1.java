package chap05;
//2차원배열을 정의하고 엑세스
//다차원배열은 배열을 참조하는 배열
public class Array2DTest1 {

	public static void main(String[] args) {
		//int형 데이터 2개를 저장할 수 있는 배열이 3세트
		int[][] myarr = new int[3][2];
		System.out.println(myarr);
		System.out.println("각 요소가 참조하는 배열:"+myarr[0]);
		System.out.println("각 요소가 참조하는 배열:"+myarr[1]);
		System.out.println("각 요소가 참조하는 배열:"+myarr[2]);
		
//		System.out.println(myarr[0][0]);
//		System.out.println(myarr[1][0]);
//		System.out.println(myarr[2][0]);
		myarr[0][0]=100;
		myarr[1][1]=200;
		System.out.println("===================");
		System.out.println(myarr.length);
		System.out.println(myarr[0].length);
		System.out.println(myarr[1].length);
		System.out.println(myarr[2].length);
		
		for(int row=0;row<myarr.length;row++) {
			for(int i=0;i<myarr[row].length;i++) {
				System.out.print(myarr[row][i]+"\t");
			}
			System.out.println();
		}
		
	}

}
