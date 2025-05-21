package polymorphism.exam;

public class CarFactory extends Factory implements IWorkingTogether{
	public CarFactory() {
		
	}
	public CarFactory(String name, int openHour, int closeHour) {
		super(name, openHour, closeHour);
	}
	@Override
	public int workTogether(IWorkingTogether partner) {
		int productScoreB = 0;
		productScoreB = 2*getWorkingTime();
		return productScoreB;
	}
	@Override
	public int makeProducts(char skill) {
		int productScore = 0;
		if(skill=='A') {
			productScore = 3*getWorkingTime();
		}else if(skill=='B') {
			productScore = 2*getWorkingTime();
		}else if(skill=='C') {
			productScore = 1*getWorkingTime();
		}else {
			productScore = 0*getWorkingTime();
		}
		return productScore;
	}
	
}
