package oop.basic.chap05;
//1번,2번,3번 메소드를 정의
//Calc.java,ForExam_GuGu,MultiForGuGu클래스에서는 메소드로 분리된 로직을 지우고
//MyMethodDemo에 정의된 메소드를 호출해서 사용하는 코드로 변경하세요.

public class MyMethodDemo {
	//1번
	//메소드명 : printGuGu
	//매개변수 : 출력할 단
	//리턴값 : X
	public void printGuGu(int dan) {
		for(int i=1;i<=9;i++) {
			System.out.println(dan+" * "+ i +" = "+(dan*i));
		}	
	}
//	2. MultiForGuGu.java에서 전체 구구단을 출력하는 모든 부분을 메소드로 바꾸어 정의하고 호출하도록 코드를 변경하세요.
//	메소드명 : printGuGu
//	매개변수 : X
//	리턴값 : X
//	p
	public void printGuGu() {
		for(int dan=2;dan<=9;dan++) {
			for(int i=1;i<=9;i++) {
				System.out.print(dan +" * "+i+" = "+(dan*i)+"\t");
			}
			System.out.println();
		}
	}	
// 3. Calc.java 파일에서 아래 코드 부분을 다음 조건에 맞게 메소드로 변경하세요.
//	메소드명 : calc
//	리턴값 : int의 계산결과
//	매개변수:3개(연산자, 숫자1, 숫자2)		
		
	public int calc(int opr,int num1,int num2) {
		int result = 0;
		if(opr==1) {
			result = num1+num2;
		}else if(opr==2) {
			result = num1*num2;
		}else if(opr==3) {
			result = num1-num2;
		}else {
			result = num1/num2;
		}
			
		return result;
		
	}
		
	
}
