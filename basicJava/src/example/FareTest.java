package example;

import java.util.Scanner;

public class FareTest {

	public static void main(String[] args) {
		System.out.println("-----Menu---------");
		System.out.println("1. 가정용 (liter당 50원)");
		System.out.println("2. 산업용 (liter당 45원)");
		System.out.println("3. 공업용 (liter당 30원)");
		System.out.println("----------------------");
		Scanner key = new Scanner(System.in); //scanner이라는 클래스를 key 변수 안에 연결, 참조변수
		System.out.println("메뉴를 선택하세요=>"); //무슨 용도의 기름을 사용할지
		int menuNum = key.nextInt(); //사용자코드 변수
		System.out.println("----------------------");
		System.out.println("사용량을 입력하세요=>");
		int use = key.nextInt(); //사용량 값을 입력할 수 있는 변수
		
		System.out.println("======================");
		System.out.println("사용자코드: "+menuNum); //사용자코드를 출력
		//사용요금+총수도요금
		int aCash = use*50;
		int bCash = use*45;
		int cCash = use*30;
		double tax = 0.05; //세금 5% 변수
		//switch로 작성
		switch(menuNum) {
			case 1:
				System.out.println("사용요금: "+aCash);
				System.out.println("총수도요금: "+(aCash+aCash*tax));
				break;
			case 2:
				System.out.println("사용요금: "+bCash);
				System.out.println("총수도요금: "+(bCash+bCash*tax));
				break;
			default:
				System.out.println("사용요금: "+cCash);
				System.out.println("총수도요금: "+(cCash+cCash*tax));
		}
		
		/* if문으로 작성한 코드
		if(menuNum==1) {
			System.out.println("사용요금: "+aCash);
			System.out.println("총수도요금: "+(aCash+aCash*tax));
		} else if(menuNum==2) {
			System.out.println("사용요금: "+bCash);
			System.out.println("총수도요금: "+(bCash+bCash*tax));
		} else {
			System.out.println("사용요금: "+cCash);
			System.out.println("총수도요금: "+(cCash+cCash*tax));
		}
		*/
		
		
	}

}
