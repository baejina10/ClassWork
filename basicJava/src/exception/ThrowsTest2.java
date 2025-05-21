package exception;

import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

public class ThrowsTest2 {

	public static void main(String[] args) {
		//울산의 개발자가 메소드를 호출
		ThrowsTest obj = new ThrowsTest();
		obj.test("test3.txt");
		
		//대전의 A개발자는 오류가 뜨면 파일명을 다시 입력받고 싶다.
		try {
			//서울의 A회사의 개발자는 오휴가 발생하면 단순하게 메시지만 출력하고 싶다.
			obj.test2("test2.txt");
		}catch (FileNotFoundException e) {
			JOptionPane.showInputDialog("파일명이 틀렸습니다. 다시 입력하세요.");
		}	
	}

}
