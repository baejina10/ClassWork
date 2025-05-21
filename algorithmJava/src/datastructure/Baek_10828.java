package datastructure;

import java.awt.PopupMenu;
import java.util.Scanner;
import java.util.Stack;

public class Baek_10828 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int num = key.nextInt();
		for(int i=1;i<=num;i++) {
			String str = key.next();
			switch (str) {
			case "push" :
				System.out.println("push");
				break;
			case "pop" :
				if(stack.size()==0) {
					System.out.println(-1);
				} else {
					System.out.println(stack.size());
				}
				break;
			case "size" :
				stack.size();
				break;
			case "empty" :
				if(stack.empty()) {
					System.out.println(-1);
				} else {
					System.out.println(0);
				}
				break;
			case "top" :
				if(stack.empty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.pop());
				}
			}
			
			
		}

	}

}
