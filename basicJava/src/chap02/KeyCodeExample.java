package chap02;

public class KeyCodeExample {
	public static void main(String[] args) throws Exception {
		int keyCode;
		
		/*keyCode = System.in.read();
		System.out.println("keyCode: "+keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: "+keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: "+keyCode);
		*/
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("kerCode: "+keyCode);
			if(keyCode==113) {
				break;
			}
		}
		System.out.println("종료");
	
	}
}
