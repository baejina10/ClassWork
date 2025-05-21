package oop.basic.chap05.constructor;

public class TestMovie { 
	public static void main(String[] args) { 
		Movie myMovie = new Movie("겨울왕국2","애니메이션");
		System.out.println(myMovie.getTitle("국가대표"));
		myMovie.play();
		System.out.println("--------------------");

		Movie yourMovie = new Movie("아바타","SF");
		yourMovie.play();
	}

}