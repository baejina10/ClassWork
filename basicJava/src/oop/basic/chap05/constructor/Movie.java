package oop.basic.chap05.constructor;

public class Movie {
	private String title;//영화명
	private String genre;//장르
	public Movie() {
		
	}
	public Movie(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	//참고해보자
	public String getTitle(String title) {
		return title;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGenre() {
		return genre;
	}
	public void play() {
		System.out.println(title+"("+genre+") 상영중입니다.");
	}
}
