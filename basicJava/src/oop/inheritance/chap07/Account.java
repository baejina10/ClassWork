package oop.inheritance.chap07;

public class Account {
	private String accId; //계좌번호
	private long balance; //잔액
	private String ownerName;
	public Account() {//기본생성자
		
	}
	public Account(String accId, long balance, String ownerName) {
		super();
		this.accId = accId;
		this.balance = balance;
		this.ownerName = ownerName;
	}
	//메소드
	public void deposit(long amount) { // 입금하기  
			balance = balance + amount;
	}
	public void withdraw(long amount) { //출금하기
		balance = balance - amount;
	}
	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public long getBalance() { //잔액조회하기
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

}
