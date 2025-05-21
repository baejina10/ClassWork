package polymorphism.exam;

public class Tea extends Beverage {
	static int amount;
	public Tea() {
		
	}
	public Tea(String name) {
		super(name);
		amount++;
		calcPrice();
	}

	@Override
	public void calcPrice() {
		if(getName().equals("lemonTea")) {
			price = 1500;
		} else if(getName().equals("ginsengTea")) {
			price = 2000;
		} else if(getName().equals("redginsengTea")) {
			price = 2500;
		} else {
			price = 0;
		}
		
	}

}
