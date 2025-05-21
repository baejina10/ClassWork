package inheritance.exam;

public class Secretary extends Employee implements Bonus {
	public Secretary() {
		
	}
	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	@Override
	public void incentive(int pay) {
		// 인센티브 지급
		// 부모클래스의 멤버변수가 private면 자식이 상속 받아도 마음대로 가지고 올 수 없다.
		//=> salary 값을 가져오려면 get으로 가져와야 한다. 그러니 아래 코드처럼 따로 변수를 만들고 getsalary로 계산할 식을 만들어야한다.
		// 그렇게 해서 만들었는데 int incen = getSalary()+(int)(pay*0.8);를 만들었는데 결과값에 인센이 포함된 월급이 나오지 않았다.
		//                                              -----------
		// 여기서 (int)를 안넣으면 오류가 뜨는데                     이 계산값이 실수로 계산값이 나와서 이를 정수타입에 저장하기 위해 정수로 바꿔야 한다 그래서 앞에 (int)를 넣어 강제변환해야함.
		//=>  이유는 계산은 되어 있지만 incen 변수에만 결과값이 저장되어있고 salary에는 저장이 안되어서이다. 그러면 salary 멤버변수에 값을 저장하기 위해서는 setSalary를 가져와 
		// 매개변수에 incen을 넣어줘야 salary에 인센이 포함된 값이 저장된다. 
		int incen = getSalary()+(int)(pay*0.8);
		setSalary(incen);
	}
	@Override
	public double tax() {
		// 세금
		double tax = getSalary(); //부모클래스의 멤버변수가 private면 자식이 상속 받아도 마음대로 가지고 올 수 없음.
		tax = tax*0.1;            //따로 변수를 만들어서 그 변수에 getSalary를 이용해서 값을 저장한다. 그리고 그 값을 저장한 변수를 가지고 코드를 작성한다.
		return tax;
	}
	
}
