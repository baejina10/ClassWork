package oop;

import java.util.ArrayList;
import java.util.List;

public class MemberMgr {
	//List<Member> memberlist;
	Member[] memberlist;
	public MemberMgr() {
		//memberlist = new ArrayList<Member>();
	}
//	public MemberMgr(List<Member> memberlist) {
//		super();
//		this.memberlist = memberlist;
//	}
	public MemberMgr(Member[] memberlist) {
		super();
		this.memberlist = memberlist;
	}

	@Override
	public String toString() {
		return "MemberMgr [memberlist=" + memberlist + "]";
	}

	public Member[] getMemberlist() {
		return memberlist;
	}

	public void setMemberlist(Member[] memberlist) {
		this.memberlist = memberlist;
	}
	public void addMember(Member member) {
		//memberlist.add(member);
		
	}
	public void print() {
		for(Member data:memberlist) {
			System.out.println("회원ID:"+data.getId()+",회원명:"+data.getName()+",나이:"+data.getAge());
		}
	}
	
}
