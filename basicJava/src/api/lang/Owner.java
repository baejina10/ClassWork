package api.lang;

public class Owner {
	private String name;
	private String cellPhone;
	public Owner() {
		
	}
	public Owner(String name, String cellPhone) {
		this.name = name;
		this.cellPhone = cellPhone;
	}
	@Override
	public String toString() {
		return "이름은 " + name + "이고 핸드폰 번호는 " + cellPhone + "입니다.";
	}
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(obj==null | this.getClass()!=obj.getClass()) return false;
		if(obj instanceof Owner) {
			Owner o = (Owner)obj;
			if(this.name.equals(o.name)) {
				return true;
			}
		}
		return false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	
	
}
