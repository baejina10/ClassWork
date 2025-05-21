package chap05;

import java.util.Random;

/*
 * [미션1]
 * 가수가 좋아하는 과목을 아래의 형식으로 출력하세요
 * RM - java
 * 진 - servlet
 *   ....
 *   ....
 * 정국 - raspberryPI
 * 
 * [미션2]
 * 5글자 이상의 과목을 좋아하는 singer를 새로운 배열에 저장하고 저장된 배열의 singer를 
 * 출력하세요
 * 
 * 진, 지민, 슈가, 제이홉, 정국
 *   
 */
public class ArrayExam5 {
	public static void main(String[] args) {
		String[] singer = {"RM","진","뷔","지민","슈가","제이홉","정국"};
		String[] singerFavoriteSubject 
			= {"java","servlet","jsp","spring"
					,"jenkins","kubernetes","raspberryPI"};
		/*
		 * [미션1]
		 * 가수가 좋아하는 과목을 아래의 형식으로 출력하세요
		 * RM - java
		 * 진 - servlet
		 *   ....
		 *   ....
		 * 정국 - raspberryPI
		 */
	
		for(int i=0;i<singer.length;i++) {
			System.out.println(singer[i]+"-"+singerFavoriteSubject[i]);
		}
		System.out.println("-----------------------------------------");
	
		/* [미션2]
		* 5글자 이상의 과목을 좋아하는 singer를 새로운 배열에 저장하고 저장된 배열의 singer를 
		* 출력하세요
		* 진, 지민, 슈가, 제이홉, 정국 
		*/
		String[] fiveSinger = {"진", "지민", "슈가", "제이홉", "정국"};
		for(int i=0;i<fiveSinger.length;i++) {
			System.out.print(fiveSinger[i]+" ");
		}
		
	}

}