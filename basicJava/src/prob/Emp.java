package prob;

public class Emp {
	private String name;
	private String id;
	private int baseSalry;
	private double salary;
	//생성자
	public Emp() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getBaseSalry() {
		return baseSalry;
	}
	public void setBaseSalry(int baseSalry) {
		this.baseSalry = baseSalry;
	}
	public double getSalary(double bonus) {
		salary = baseSalry+baseSalry*bonus;
		return salary;
	}
	public String toString() {
		String str = "\""+name+"("+id+") 사원의 기본급은 "+baseSalry+"원 입니다.\"";
		return str;
	}
	
	
	
}