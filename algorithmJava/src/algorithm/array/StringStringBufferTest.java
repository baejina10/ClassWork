package algorithm.array;
//String과 StringBuffer의 성능비교
public class StringStringBufferTest {
	//String으로 객체를 만들고 문자열을 추가해서 실행시간을 측정
	public static void stringCheck(int count) {
		long start = System.nanoTime();//작업실행전에 시간을 측정
		String str = new String("java");
		for(int i=1;i<=count;i++) {
			str = str+"java";//for문이 실행되는 동안 str에 java문자열을 append -143593100
			                                                           //140659000
			//str = str + new String("java");
		}
		long end = System.nanoTime();//작업이 종료되는 시간 측정
		System.out.println("str = str + java");
		System.out.println("실행시간:"+(end-start));
	}
	//StringBuilder로 객체를 만들고 문자열을 추가해서 실행시간을 측정
	public static void stringbufferCheck(int count) {
		long start = System.nanoTime();//작업실행전에 시간을 측정 -741500
		                                                 //293400
		StringBuilder str = new StringBuilder("java");
		for(int i=1;i<=count;i++) {
			str.append("java");//for문이 실행되는 동안 str에 java문자열을 append
		}
		long end = System.nanoTime();//작업이 종료되는 시간 측정
		System.out.println("str.append('java')");
		System.out.println("실행시간:"+(end-start));
	}
	public static void main(String[] args) {
		int count = 10000;
		stringCheck(count);
		System.out.println("=============================================");
		stringbufferCheck(count);
	}

}
