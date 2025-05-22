package recursion;
/*
 * 주어진 숫자만큼 *을 출력
 * - 반복문을 사용하지 말고 한 번에 * 한 개씩 출력할 수 있도록 재귀를 이용해서 작업하기
 */
public class RecursionExam2 {
	public static void printStar(int star) {
		if(star==0) {
			return ;
		}
		System.out.print("*");
		printStar(star-1);
	}
	public static void main(String[] args) {
		printStar(10);

	}

}
