package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JOptionPane;

//throws를 이용해서 예외를 호출한 곳으로 넘기기
public class ThrowsTest {
	//1. 메소드 내부의 예외를 처리하기 위한 방법 중 하나는 예외가 발생한 곳에서 예외를 처리하기
	//  => 호출한 곳에서 예외가 발생한 것을 알 수 없다.
	//  => 이미 예외에 대한 처리가 끝난 상태로 전달이 되므로 호출한 곳에서 다양하게 처리하기 어렵다.
	public void test(String filename) {
		try {
			FileReader fr = new FileReader(filename);
		}catch (FileNotFoundException e) {
			System.out.println("파일명이 틀렸습니다.~~~~");
		}
	}
	//2. 예외가 발생한 곳에서 예외를 처리하지 않고 호출한 곳으로 얘외를 처리하도록 하기
	//  => 예외가 발생되더라도 예외가 발생된 곳에서 처리하지 않고 호출한 곳으로 예외를 던지기
	//  => 메소드를 호출한 곳에서 예외가 발생하므로 다양하게 처리할 수 있다.
	public void test2(String filename) throws FileNotFoundException, NullPointerException {
		FileReader fr = new FileReader(filename);
	}
	
	public static void main(String[] args) {
		//A회사의 개발자가 사용
		ThrowsTest obj = new ThrowsTest();
		obj.test("test2.txt");
		try {
			//서울의 A회사의 개발자는 오류가 발생하면 단순하게 메시지만 출력하고 싶다.
			obj.test2("test2.txt");
		}catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "파일명이 틀렸습니다.");
		}	
	}

}
