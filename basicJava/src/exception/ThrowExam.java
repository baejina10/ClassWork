package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowExam {
	//Throws를 이용해서 예외를 호출한 곳에서 처리하도록 작업하세요
    public void test() throws InputMismatchException, NullPointerException {
        Scanner key = new Scanner(System.in);
        String str = null;
        System.out.println("숫자입력:");
        int data = key.nextInt();
        System.out.println("입력한 숫자는 :"+data);
        
        System.out.println(str.length());
    }
    
    public static void main(String[] args) {
        ThrowExam obj = new ThrowExam();
       try {
    	   obj.test();
       } catch (InputMismatchException e) {
    	   System.out.println("숫자만 입력하세요");
       } catch (NullPointerException e) {
    	   System.out.println("null");
       } catch (Exception e) {
    	   System.out.println("예외처리");
       } finally {
    	   System.out.println("완료");
       }
    }

}