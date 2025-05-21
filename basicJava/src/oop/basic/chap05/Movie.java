package oop.basic.chap05;

public class Movie {
	String title;//영화명
	String genre;//장르
	
	public void setTitle(String t) {
		title = t;
	}
	public void setGenre(String g) {
		genre = g;
	}
	public void play() {
		System.out.println(title+"("+genre+") 상영중입니다.");
	}
}
