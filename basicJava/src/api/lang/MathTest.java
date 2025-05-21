package api.lang;

public class MathTest {
	public static void main(String[] args) {
		System.out.println("Math.PI=>"+Math.PI);
		System.out.println("Math.abs(-1)=>"+Math.abs(-1));//절대값
		System.out.println("Math.ceil(10.3)=>"+Math.ceil(10.3));//올림
		System.out.println("Math.floor(10.8)=>"+Math.floor(10.8));//버림
		System.out.println("Math.round(10.6)=>"+Math.round(10.6));//반올림
		System.out.println("Math.max(100,200)=>"+Math.max(100,200));//최대값
		System.out.println("Math.min(100,200)=>"+Math.min(100,200));//최소값
		System.out.println("Math.random()=>"+Math.random());//0~1사이의 값
	}
}
