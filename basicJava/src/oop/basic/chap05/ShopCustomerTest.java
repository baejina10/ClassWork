package oop.basic.chap05;

public class ShopCustomerTest {

	public static void main(String[] args) {
		ShopCustomer customer1 = new ShopCustomer();
		customer1.name = "엔코아";
		customer1.addr = "서울";
		customer1.id = "playdata0502";
		customer1.pass = "play12345";
		customer1.point = 5000;
		
		System.out.println("성명:"+customer1.name);
		System.out.println("주소:"+customer1.addr);
		System.out.println("아이드:"+customer1.id);
		System.out.println("패스워드:"+customer1.pass);
		System.out.println("포인트:"+customer1.point);
		

	}

}
