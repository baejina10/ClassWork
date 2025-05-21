package inheritance.exam;

public class Company {
	public static void main(String[] args) {
		Secretary sec = new Secretary("Hilery", 1, "secretary", 800);
		Sales sal = new Sales("Clinten", 2, "sales", 1200);
		System.out.println("name \t\t department \t salary");
		System.out.println("------------------------------------------");
		System.out.println(sec.getName() + " \t\t " + sec.getDepartment()
				+ " \t " + sec.getSalary());
		System.out.println(sal.getName() + " \t " + sal.getDepartment()
				+ " \t\t " + sal.getSalary());
		System.out.println();
		System.out.println("인센티브 100 지급");
		System.out.println();
		sec.incentive(100);
		sal.incentive(100);
		System.out.println("name \t\t department \t salary \t tax");
		System.out
				.println("-----------------------------------------------------------");
		System.out.println(sec.getName() + " \t\t " + sec.getDepartment()
				+ " \t " + sec.getSalary() + " \t\t " + sec.tax());
		System.out.println(sal.getName() + " \t " + sal.getDepartment()
				+ " \t\t " + sal.getSalary() + " \t\t " + sal.tax());

	}
}
