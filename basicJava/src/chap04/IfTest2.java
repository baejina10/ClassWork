package chap04;
//
public class IfTest2 {

	public static void main(String[] args) {
		int num=99;
		//90보다 크면 "조건만족"문자열을 출력
		//90보다 작거나 같으면 "조건 만족하지 않음"출력
		if(num>90) {
			System.out.println("조건만족");
		} else {
			System.out.println("조건 만족하지 않음");
		}
		// 비교해야 하는 데이터가 같은 변수인 경우 if문을 각각 작성하게 되면 중복해서 평가하는 상황이 발생하므로 지양
		/*
		if(num>90) {
			System.out.println("조건만족");
		} if(num<=90){  
			System.out.println("조건 만족하지 않음");
		}
		*/
	}

}
