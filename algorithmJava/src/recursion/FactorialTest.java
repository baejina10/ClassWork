package recursion;

public class FactorialTest {
	public static int factorial(int num) {
		if(num==1) {
			return 1;
		}else {
			return num*factorial(num-1);
		}
	}
	public static void main(String[] args) {
		System.out.println("5!="+factorial(5));//
		System.out.println("=======================");
		//===============재귀없이 작업하기===============
		int sum = 1;
		for(int i=1;i<=5;i++) {
			System.out.println("sum=sum*"+i);
			sum = sum*i;
		}
		System.out.println("5!="+sum);
		
	}

}
