package prob;

public class BookMgr {
	
	Book[] booklisk;
	
	public BookMgr(Book[] booklist) {//생성자
		this.booklisk = booklist;
	}
	
	public void printBooklist(){
		for(int i=0;i<booklisk.length;i++) {
			System.out.println(booklisk[i].getTitle());
		}
	}
	
	public void printTotalPrice(){
		int total = 0;
		for(int i=0;i<booklisk.length;i++) {
			total = total+booklisk[i].getPrice();
		}
		System.out.println("전체 책 가격의 합 : "+total);
	}
}
