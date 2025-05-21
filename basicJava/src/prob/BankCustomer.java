package prob;

public class BankCustomer {
	private String name; //고객이름
	private int currentMoney; //현재잔액
	
	public BankCustomer() {
		
	}
	public BankCustomer(String name, int currentMoney) {
		this.name = name;
		this.currentMoney = currentMoney;
	}
	public int getCurrentMoney() {
		return currentMoney;
	}
	public void withdraw(int money) {
		if(money<=currentMoney) {
			currentMoney=currentMoney-money;
		} else {
			System.out.println("잔액이 부족하여 인출할 수 없습니다.");
		}
	}

}
