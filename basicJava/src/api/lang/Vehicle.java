package api.lang;

public class Vehicle {
	private Owner owner; //has a 관계, Vehicle이 Owner가 들어가 있다.
	private int price;
	
	public Vehicle() {
		
	}
	
	public Vehicle(Owner owner, int price) {
		this.owner = owner;
		this.price = price;
	}

	public boolean equals (Object obj) {
		if(this==obj) return true;
		if(obj==null | this.getClass()!=obj.getClass()) return false;
		if(obj instanceof Vehicle) {
			Vehicle v =(Vehicle)obj;
			if(this.owner.equals(v.owner)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "소유주정보 : " + owner + "\n차량정보 : 가격은 " + price + "입니다.";
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
