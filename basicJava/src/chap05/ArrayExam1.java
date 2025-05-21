package chap05;
//-int형 데이터를 3개를 담을 수 있는 배열을 생성
//-0번요소에 1000
// 2번 요소에 2000을 초기값으로 저장
//-모든 배열요소를 sysout으로 출력하기
public class ArrayExam1 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 1000;
		arr[2] = 2000;
		
		System.out.println("0번요소=>"+arr[0]);
		System.out.println("1번요소=>"+arr[1]);
		System.out.println("2번요소=>"+arr[2]);

	}

}
