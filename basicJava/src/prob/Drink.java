package prob;

public class Drink {
	//필드
	private String name;
	private int price;
	private int count;
	//생성자
	public Drink() {//기본생성자
		
	}
	
	public Drink(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}

	//메소드
	public int getTotalPrice() { //금액(단가*수량) 계산 메소드
		return price*count;
	}
	public static void printTitle() { //타이틀 출력 메소드
		System.out.println("상풍명\t단가\t수량\t금액");
	}
	public void printData() { //상품 정보 출력 메소드
		System.out.println(name+"\t"+price+"\t"+count+"\t"+getTotalPrice());
	}
	//get&set 메소드

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
