package oop.inheritance.chap07;
//ctrl+shift+f 면 정리가 된다

public class CheckingAccount extends Account {//하위클래스
	private String cardNo;
	public CheckingAccount() {//기본생성자
		
	}
	public CheckingAccount(String accId, String ownerName, long balance, String cardNo) {
		super(accId,balance,ownerName);
		this.cardNo = cardNo;
	}
	//참조형에서 ==는 주소를 비교
	//문자열비교 equals
	public void pay(long amount, String cardNo) {
		if(this.cardNo.equals(cardNo)& getBalance()>=amount) {
			//setBalance(getBalance()-amount);
			withdraw(amount);
		} else {
			System.out.println("지불이 불가능합니다.");
		}
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
}
