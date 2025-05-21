package api.util;

import java.util.StringTokenizer;

public class StringtokenizerTest {
	public static void main(String[] args) {
		String str = "java,mysql,oracle,html,css,javascript,jQuery";
		StringTokenizer st = new StringTokenizer(str,",");
		                            //----------------------------
		//                             클래스가 갖고 있는 내부저장소에 ,로 분리된 문자열을 저장
		//                                                    => token
		System.out.println(st.hasMoreTokens());
		while(st.hasMoreTokens()) { //내부저장소에 토큰이 있는지 없는지 확인
			System.out.println(st.nextToken());//내부저장소에 있는 토큰을 꺼내기
		}
	}

}
