package oop;

import java.util.ArrayList;
import java.util.List;

//책을 관리하는 클래스
//우리가 갖고 있는 모든 책의 정보를 조회, 책을 추가, 책을 삭제...
public class BookMgr {
	//DB에 저장된 데이터를 가져오지 못하므로 자료구조를 정의해서 책을 보관
	private List<Book> booklist; // has a 관계
	public BookMgr() {
		booklist = new ArrayList<Book>();
	}
	public BookMgr(List<Book> booklist) {
		super();
		this.booklist = booklist;
	}
	public List<Book> getBooklist() {
		return booklist;
	}
	public void setBooklist(List<Book> booklist) {
		this.booklist = booklist;
	}
	//CRUD - CLRUD
	//insert select update delete
	//CLRUD - insert, L-여러 개 목록이 조회, R-하나의 레코드만 조회, update delete
	//1.ArrayList에 Book데이터 저장하기
	public void addBook(Book book) {
		booklist.add(book);
	}
	
	//2. 전체 Booklist조회
	public void print() {
		for(Book book:booklist) {
			System.out.println("책제목:"+book.getTitle()+",가격:"+book.getPrice());
		}
	}
	
}
