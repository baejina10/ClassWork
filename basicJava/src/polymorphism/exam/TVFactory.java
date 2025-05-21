package polymorphism.exam;

public class TVFactory extends Factory implements IWorkingTogether{
	public TVFactory() {
		
	}
	public TVFactory(String name, int openHour, int closeHour) {
		super(name, openHour, closeHour);
	}

	@Override
	public int workTogether(IWorkingTogether partner) {
		int productScoreC = 0;
		productScoreC = 3*getWorkingTime();
		return productScoreC;
	}

	@Override
	public int makeProducts(char skill) {
		int productScore = 0;
		if(skill=='A') {
			productScore = 8*getWorkingTime();
		}else if(skill=='B') {
			productScore = 5*getWorkingTime();
		}else if(skill=='C') {
			productScore = 3*getWorkingTime();
		}else {
			productScore = 1*getWorkingTime();
		}
		return productScore;
	}

	
}
