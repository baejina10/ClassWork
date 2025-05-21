package chap02;

public class TimeTest {
	public static void main(String[] args) {
		int time = 8800;
		int hour = time/3600;
		int tempdate = time%3600; //나머지-시간데이터 뺀 나머지값
		int min = tempdate/60;
		int sec = tempdate%60;
		//결과 출력 선언문
	
		System.out.println(hour+"시간"+min+"분"+sec+"초");

	}
}
