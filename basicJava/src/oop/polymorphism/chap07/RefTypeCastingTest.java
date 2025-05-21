package oop.polymorphism.chap07;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Random;

public class RefTypeCastingTest {
	public static void main(String[] args) {
		// 상속관계에 있는 클래스만 캐스팅이 가능
		// 문법오류 - 상속관계가 아니므로 캐스팅이 불가능
//		Random rand = new Random();
//		String str = (String)rand;
		
		//상속관계에 있는 클래스는 자동캐스팅
		//상위클래스타입 변수 = new 하위클래스();
		ArrayList<String> list = new ArrayList<String>();
		AbstractList<String> superlist = new ArrayList<String>();
		AbstractCollection<String> supersuperlist = new ArrayList<String>();
		System.out.println(list);
		System.out.println(superlist);
		System.out.println(supersuperlist);
	}

}
