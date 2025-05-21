package chap05;
//myarr 이름으로
//int형 데이터 3개를 저장할 수 있는 배열3개를 2차원배열로 생성하세요
/*
 * 0,0=>100
 * 1,1=>200
 * 2,2=>300
 * 초기값으로 할당하기
 */
//2차원배열의 값을 출력하세요
public class Array2DExam1 {

	public static void main(String[] args) {
		int[][] myarr = new int [3][3];
		myarr[0][0] = 100;
		myarr[1][1] = 200;
		myarr[2][2] = 300;
		
		for(int row=0;row<3;row++) {
			for(int i=0;i<3;i++) {
				System.out.print(myarr[row][i]+"\t");
			}
			System.out.println();
		}

	}

}
