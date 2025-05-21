package oop.basic.chap05;

public class TestMovie { 
	public static void main(String[] args) { 
		Movie myMovie = new Movie();
		myMovie.setTitle("겨울왕국2");
		myMovie.setGenre("애니메이션");
		myMovie.play();
		System.out.println("--------------------");

		Movie yourMovie = new Movie();
		yourMovie.setTitle("아바타");
		yourMovie.setGenre("SF");
		yourMovie.play();
	}

}