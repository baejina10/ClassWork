package api.lang;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//
public class ClassTest {
	public String addr;
	public String name;
	int age;
	public void test() {
		
	}
	public void run() {
		
	}
	
	public static void main(String[] args) {
		ClassTest obj = new ClassTest();
		Class myclass = obj.getClass();
		System.out.println(myclass.getName());
		System.out.println(myclass.getPackageName());
		Field[] farr = myclass.getFields();
		Method[] marr = myclass.getMethods();
		for(Field f : farr) {
			System.out.println(f.getName());
		}
		System.out.println("==================");
		for(Method m : marr) {
			System.out.println(m.getName());
		}
	}

}
