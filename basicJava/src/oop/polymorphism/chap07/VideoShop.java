package oop.polymorphism.chap07;

public class VideoShop {
	public static void main(String[] args) {
		Content[] content = new Content[3];
		content[0] = new Video("변호인","new");
		content[1] = new Video("탐정","comic");
		content[2] = new Video("헬로카봇","child");
		for (int i = 0; i < content.length; i++) {
			content[i].totalPrice();
			content[i].show();
		}
		
	}
}
