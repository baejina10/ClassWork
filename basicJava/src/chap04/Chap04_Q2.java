package chap04;
//4x+5y=60의 모든 해를 구해서 (x,y)형태로 출력하기 단,x와y는 10이하의 자연수
public class Chap04_Q2 {

	public static void main(String[] args) {
		
		for(int x=1;x<=10;x++) {
			for(int y=1;y<=10;y++) {
				if((4*x+5*y)==60) {
					System.out.println("("+x+","+y+")");
				}
			}
		}

	}

}
