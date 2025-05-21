package api.lang;
//String클래스의 중요한 메소드 살펴보기 -2(검색과추출)
public class StringTest4 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = "재밌다.";
		System.out.println("str1.startsWith(\"java\")=>"+str1.startsWith("java"));
		System.out.println("str1.startsWith(\"test\")=>"+str1.startsWith("test"));
		System.out.println("str1.endsWith(\"ing\")=>"+str1.endsWith("ing"));
		System.out.println("str1.endsWith(\"test\")=>"+str1.endsWith("test"));
		System.out.println("str1.contains(\"ja\")=>"+str1.contains("ja"));
		System.out.println("str1.contains(\"\")=>"+str1.contains(""));
		
		System.out.println("str1.substring(5)=>"+str1.substring(5));//begin index ~ 끝
		System.out.println("str1.substring(5,8)=>"+str1.substring(5,8));//begin~end-1
		System.out.println("str1.replace('a', 'A')=>"+str1.replace('a', 'A'));
		System.out.println(str1);//원본출력하기
	}

}
