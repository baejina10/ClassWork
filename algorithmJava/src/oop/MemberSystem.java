package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberSystem {
	static MemberMgr mgr ;
	public static void main(String[] args) {

		init();
		Scanner key = new Scanner(System.in);
		while(true) {
			System.out.println("*********인사관리시스템********");
			System.out.println("1. 로그인");
			System.out.println("2. 회원등록");
			System.out.println("3. 회원조회");
			System.out.println("4. 회원정보수정");
			System.out.println("5. 종료");
			System.out.print("원하는 작업을 선택하세요:");
			//코드완성
			int num = key.nextInt();
			if(num==2) {
				System.out.print("아이디:");
				String id = key.next();
				System.out.print("이름:");
				String name = key.next();
				System.out.print("나이:");
				int age = key.nextInt();
				mgr.addMember(new Member(id,name,age));

			}else if(num==3) {
				mgr.print();
			}else if (num==5) {
				System.exit(0);
			}
		}
	
	}
	public static void init() {
		//Member클래스를 임의로 5개 저장될 수 있도록 구현하세요
		//mgr = new MemberMgr(배열);
//		ArrayList<Member> memberlist = new ArrayList<Member>();
//		memberlist.add(new Member("a101", "진", 31));
//		memberlist.add(new Member("a102", "뷔", 30));
//		memberlist.add(new Member("a103", "제이홉", 29));
//		memberlist.add(new Member("a104", "지민", 28));
//		memberlist.add(new Member("a105", "RM", 32));
//		mgr = new MemberMgr(memberlist);
	}
}






