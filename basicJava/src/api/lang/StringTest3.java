package api.lang;
//String클래스의 중요한 메소드 살펴보기 -1
public class StringTest3 {

	public static void main(String[] args) {
		String str1 = new String("java proavgramming");
		String str2 = "재밌다.";
		System.out.println("str1.charAt(1)=>"+str1.charAt(1));
		System.out.println("str1.concat(str2)=>"+str1.concat(str2));
		
		System.out.println("str1.indexOf('a')=>"+str1.indexOf('a'));
		System.out.println("str1.indexOf(\"자\")=>"+str1.indexOf("자"));
		System.out.println("str1.indexOf(\"av\",5)=>"+str1.indexOf("av",5));
		System.out.println("str1.lastIndexOf('a')=>"+str1.lastIndexOf('a'));
		System.out.println("str1.lastIndexOf(\"a\")=>"+str1.lastIndexOf("a"));
		
		System.out.println("str1.length()=>"+str1.length());
		//문자열비교
		System.out.println("str1.equals(\"java programming\")=>"+str1.equals("java programming")); //대소문자 구별해서 비교
		System.out.println("str1.equals(\"Java programming\")=>"+str1.equals("Java programming"));
		System.out.println("str1.equalsIgnoreCase(\"java programming\")=>"
												+str1.equalsIgnoreCase("java programming")); //대소문자 상관없이 문자열만 보고 비교
		System.out.println("str1.equalsIgnoreCase(\"Java programming\")=>"
												+str1.equalsIgnoreCase("Java programming"));
		//대소문자변환
		System.out.println("str1.toUpperCase()=>"+str1.toUpperCase());
		System.out.println("원본=>"+str1);
		System.out.println("str1.toLowerCase()=>"+str1.toLowerCase());
		
		
		
	}

}
