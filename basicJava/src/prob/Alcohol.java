package prob;

public class Alcohol extends Drink {
	//필드변수
	private double alcper;
	
	public Alcohol() {//기본메소드
		
	}

	public Alcohol(String name, int price, int count, double alcper) {
		super(name, price, count);
		this.alcper = alcper;
	}
	public static void printTitle() { //타이틀 출력 메소드
		System.out.println("상풍명(도수[%])\t단가\t수량\t금액");
	}
	public void printData() { //상품 정보 출력 메소드
		System.out.println(super.getName()+"("+alcper+")"+"\t"+super.getPrice()+"\t"+super.getCount()+"\t"+super.getTotalPrice());
	}
	
}
