package chap04;

import java.util.Scanner;

//switch로 변경
public class SwitchExam2 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
        System.out.print("점수:");
        int jumsu = key.nextInt();
        String score = "";
        if(jumsu>=0 & jumsu<=100){
        	switch(jumsu/10) {
        		case 10,9:
        			score = "A학점";
        			break;
        		case 8:
        			score = "B학점";
        			break;
        		case 7:
        			score = "C학점";
        			break;
        		case 6:
        			score = "D학점";
        			break;
        		default:
        			score = "F학점";
        	
        	}
            /*
        	if(jumsu>=90) {
                score = "A학점";
            }else if(jumsu>=80) {
                score = "B학점";
            }else if(jumsu>=70) {
                score = "C학점";
            }else if(jumsu>=60) {
                score = "D학점";
            }else {
                score = "F학점";
            }
            */
            System.out.println("점수:"+jumsu+"\n평가:"+score);
        }else {
            System.out.println("잘못입력");
        }
	}

}
