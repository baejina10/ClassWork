package string;

import java.util.Scanner;
//문자열을 이중 for문으로 순회하며 작업
/**
 * 1.문서(line1)의 첫 글자부터 반복문 안에서 순회가 가능
 * 2.문서의 0번 위치의 글자부터 주어진 단어와 한글자씩 비교
 *   -일치 : 단어가 아나 이동할때 문서도 하나 이동해서 동일한 위치의 글자를 비교
 *          연속된 문자열이 같은 비교하기 때문에 글자가 이동하면
 *          문서도 동일한 위치만큼 이동
 *         
 *   -일치하지 않는 경우 : 첫글자를 비교했는데 다른 경우 단어의 다음글자를 비교할 필요가 없으므로
 *                    단어를 반복하는 구문은 빠져나오고 문서에서 한 글자를 이동해서 다시 비교
 *  => 2번 작업을 문서의 마지막 글자까지 반복 작업      
 *  => 문서의 마지막인지 체크     
 *  => index를 이용하는 경우 index     ?          
 * 3. 문서에서 단어와 일치하는 경우를 만나면 count변수를 증가해서 횟수를 계산
 * 
 */

public class Baek_1543_String_losic {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String line1 =key.nextLine();
		String line2 =key.nextLine();
		int count = 0;
		for(int i=0;i<line1.length();i++){//문서를 반복하는 외부 for문
			boolean state = true;
			//System.out.println(line1.charAt(i));
			for(int j=0;j<line2.length();j++) {//단어를 반복하는 내부 for문
				int index = i+j;
				if(index>=line1.length() || line1.charAt(index)!=line2.charAt(j)) {//다르다
					//System.out.println("다르다");
					state = false;
					break;
				}else {//같다
					//System.out.println("같다");
				}
			}
			if(state) {//일치하는 단어를 만난 경우
				count++;//일치 횟수를 증가시키고
				//i가 단어 다음부터 비교할 수 있도록 i값을 변경
				i = i+line2.length()-1;
			}
			
		}
		System.out.println(count);
		

	}

}
