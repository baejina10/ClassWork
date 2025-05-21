package polymorphism.exam;

public abstract class Content {
	private String title;
	private int price;
	
	public Content() {
		
	}
	public Content(String title) {
		super();
		this.title = title;
	}
	public abstract void totalPrice();
	
	public void show() {
		System.out.println(title+" 비디오의 가격은 "+price+" 원 입니다.");
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
