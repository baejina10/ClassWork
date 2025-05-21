package inheritance.exam;

public class Sales extends Employee implements Bonus{
	public Sales() {
		
	}
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	@Override
	public void incentive(int pay) {
		// 인센티브 지급
		int incen = getSalary()+(int)(pay*1.2);
		setSalary(incen);
	}
	@Override
	public double tax() {
		// 세금
		double tax = getSalary();
		tax = tax*0.13;
		return tax;
	}

	

}	