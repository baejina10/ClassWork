package chap02;

public class exam01 {
	public static void main (String[] args) {
		int var1 = 0b1011; //2진수
		int var2 = 0206; //8진수
		int var3 = 365; //10진수
		int var4 = 0xB3; //16진수
		
		//byte var6 = 128; byte 허용범위는 -128~127까지라 그 허용 범위가 넘어서 에러가 뜸
		//long blance = 30000000000L; 
		//기본적인 컴파일러는 정수 int 타입을 간주함. 그래서 long을 쓸때는 마지막에 L(소문자ㅣ)을 붙여야 에러가 안뜸	
		
		char type = 'A';
		int type2 = 'A'; //int타입으로 문자를 초기화할 수 있지만 결과값을 출력할 때 문자로 출력되는게 아니라 유니코드로 출력됨.
		//char type3 = '한';
		
		//String은 클래스 타입임. char은 문자 리터럴이지만 String은 문자열 리터럴, 기호는 "(큰따옴표)를 써야함
		String name="홍길동";
		String job="프로그래머";
		
		//boolean 타입 예시
		boolean stop = false;
		if(stop) {
			System.out.println("중지합니다");
		} else {
			System.out.println("실행합니다");
		}
		
		System.out.println("var1 : "+ var1);
		System.out.println("var2 : "+ var2);
		System.out.println("var3 : "+ var3);
		System.out.println("var4 : "+ var4);
		System.out.println("type: "+type);
		System.out.println("type2: "+type2);
		System.out.println(name);
		System.out.println(job);
		
		
		}
	
}
