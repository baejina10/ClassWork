package prob;

public class Account {
	//생성자
	public Account() {
		System.out.println("[TestAccount 실행결과]");
	}
	//필드멤버
	private String accNo;
	private int balance;
	//계좌확인하는 메소드
	public void setAccNo(String accNo) {
		this.accNo=accNo;
		System.out.println(accNo+" 계좌가 개설되었습니다.");//계설되었다는 메소드 내용
	}
	public String getAccNo() {
		return accNo;
	}
	//잔고 나타내는 메소드
		public int getBalance() {
			return balance;
		}
	//입금 메소드
	public void save(int addMoney) {
		System.out.println(accNo+" 계좌에 "+addMoney+"만원이 입금되었습니다.");
		balance = balance+addMoney;
	}
	//출금 메소드
	public void deposite(int dismoney) {
		System.out.println(accNo+" 계좌에 "+dismoney+"만원이 출금되었습니다.");
		balance = balance-dismoney;
	}
	

	
}
