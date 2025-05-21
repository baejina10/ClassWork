package oop.basic.chap05.constructor;


import java.util.Scanner;
public class TestRectangle {
	public static void main(String s[]){
		Scanner keyboard = new Scanner(System.in);
		Rectangle2 rec1 = new Rectangle2();
		System.out.println("첫번째 직사각형의 색깔: ");
		rec1.setColor(keyboard.next());
		System.out.println("첫번째 직사각형의 가로: ");
		rec1.setWidth(keyboard.nextInt());
		System.out.println("첫번째 직사각형의 세로: ");
		rec1.setLength(keyboard.nextInt());
		
		Rectangle2 rec2 = new Rectangle2();
		System.out.println("두번째 직사각형의 색깔: ");
		rec2.setColor(keyboard.next());
		System.out.println("두번째 직사각형의 가로: ");
		rec2.setWidth(keyboard.nextInt());
		System.out.println("두번째 직사각형의 세로: ");
		rec2.setLength(keyboard.nextInt());
		
		System.out.println(rec1.getColor() + " 직사각형의 넓이는 " + rec1.area() + "이고 둘레는 " + rec1.perimeter() + "입니다.");
		System.out.println(rec2.getColor() + " 직사각형의 넓이는 " + rec2.area() + "이고 둘레는 " + rec2.perimeter() + "입니다.");
		
		// TODO 1) 두 직사각형의 넓이를 비교하십시오.
		//넓이는 파란 직사각형이 더큽니다.
		if(rec1.area()<rec2.area()) {
			System.out.println("넓이는 "+rec2.getColor()+" 직사각형이 더 큽니다.");
		} else {
			System.out.println("넓이는 "+rec1.getColor()+" 직사각형이 더 큽니다.");
		}
		
		// TODO 2) 두 직사각형의 둘레를 비교하십시오.
		//둘레는 같습니다.	
		if(rec1.perimeter()<rec2.perimeter()) {
			System.out.println("둘레는 "+rec2.getColor()+" 직사각형이 더 깁니다.");
		} else if(rec1.perimeter()>rec2.perimeter()) {
			System.out.println("둘레는 "+rec1.getColor()+" 직사각형이 더 깁니다.");
		} else {
			System.out.println("둘레는 같습니다.");
		}
		
	}
}



