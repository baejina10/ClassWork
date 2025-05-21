package api.lang;

public class Person {
	private String name;
	private String addr;
	private int age;
	
	public Person() {
		
	}
	public Person(String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	//equals메소드를 오버라이딩하는 이유는 객체가 갖고 있는 값을 비교하기 위해서 오버라이딩
	//jdk내부에서 사용하는 다양한 클래스들과 라이브러리 내부에서 객체가 같은지 비교하기 위해 Object가 갖고 있는
	//equals메소드를 호출해서 처리
	//객체가 갖고 있는 값을 비교할때 처리되므로 오버라이딩
	//1. this와 obj가 같은 객체인지 비교(주소)
	//2. obj가 null이 아니고 동일한 클래스인지 일단 비교
	//3. 객체가 갖고 있는 속성을 비교
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(obj==null | this.getClass()!=obj.getClass()) return false;
		//객체의 멤버변수를 비교(name,age,addr)
		//this와 매개변수 obj가 갖고 있는 name,age,addr을 비교해야 하므로 obj를 Person으로 캐스팅
		if(obj instanceof Person) {
			Person p = (Person)obj;
			//객체가 갖고 있는 모든 값을 비교
			if(this.name.equals(p.name) & this.addr.equals(p.addr) & this.age == p.age) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", add=" + addr + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return addr;
	}

	public void setAdd(String addr) {
		this.addr = addr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
