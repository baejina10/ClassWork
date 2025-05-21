package exception;

import javax.swing.JOptionPane;

//자바에서 예외 처리하는 방법 : try~catch
public class ExceptionTest2 {

	public static void main(String[] args) {
		try {
			//예외발생 가능성이 있는 코드
			System.out.println("try블럭시작");
			System.out.println(10/10); //예외발생~~
			System.out.println("try블럭종료");
		} catch (ArithmeticException e) {
			//예외가 발생하면 처리할 문장을 정의
			//JOptionPane.showInternalMessageDialog(null, "예외가 발생됐습니다.");
			System.out.println("예외발생");
			//예외메시지
			System.out.println("예외메시지:"+e.getMessage());
			//개발자가 개발중에 가장 많이 사용하는 예외처리코드
			//예외를 추적해서 콘솔에 예외가 발생한 메소드의 라인넘버를 출력
			//측, 어디서 예외가 발생하는지 위치를 확인할 수 있다
			e.printStackTrace();
		}

	}

}
