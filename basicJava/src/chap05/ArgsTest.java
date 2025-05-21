package chap05;
//명령행매개변수
//->명령라인에 입력하는 매개변수를 배열로 관리
public class ArgsTest {

	public static void main(String[] args) {
		System.out.println(args.length);
		System.out.println(args[0]+":"+args[1]);
		
		System.out.println(args[0]+args[1]);
		//Integer의 메소드에서 적절한 메소드를 찾아서 ards[0]를 변환해서 num1에
		//저장될 수 있도록 작업하기
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(num1+num2);
	}

}
