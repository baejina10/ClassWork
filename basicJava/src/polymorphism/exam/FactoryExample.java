package polymorphism.exam;


public class FactoryExample {
	
	public static void main(String[] args) {
		// ===== 1st Car Factory Information
		// Factory Name: CarABC
		// openHour: 7 AM, closeHour: 9 PM
		CarFactory CarABC = new CarFactory("CarABC", 7, 21);
		// ===== 2nd Car Factory Information
		// Factory Name: CarXYZ
		// openHour: 8 AM, closeHour: 7 PM
		CarFactory CarXYZ = new CarFactory("CarXYZ", 8, 19);
		// ===== 1st TV Factory Information
		// Factory Name: TVABC
		// openHour: 8 AM, closeHour: 5 PM
		TVFactory TVABC = new TVFactory("TVABC", 8, 17);
		// ===== 2nd TV Factory Information
		// Factory Name: TVXYZ
		// openHour: 9 AM, closeHour: 6 PM
		TVFactory TVXYZ = new TVFactory("TVXYZ", 9, 18);

		FactoryExample ex = new FactoryExample();
		// 각 공장 별로기술력값에 따른 하루 생산량과 파트너 사 협력 시 추가 생산량을 알아본다  
		ex.getResult(CarABC, 'A', CarXYZ);
		ex.getResult(CarXYZ, 'B', CarABC);
		ex.getResult(TVABC, 'A', TVXYZ);
		ex.getResult(TVXYZ, 'B', TVABC);

	}

	public void getResult(Factory mainFactory, char mainFactorySkill, IWorkingTogether partner) {
		
		System.out.println("* " + mainFactory.getFactoryName() + " 공장의 하루 생산량과 파트너 공장 협력 시 추가 생산량은 다음과 같다.");
		// TODO
		Factory partnerName = (Factory)partner; // 파트너 공장 나타내는 곳에 partner를 넣으면 그 객체의 주소가 나온다. 이는 partner는 매개변수가 IWorkingTogether 변수타입이어서 그렇다.
		                                        // 그러고 partner.getFactoryName()을 넣었지만 IWorkingTogether에는 이름을 반환하는 메소드가 없어서 오류가 뜬다.
		                                        // 그러면 이름을 반환메소드를 가지고 있는 Factory를 참조해야 한다고 생각이 듬. 
												// IWorkingTogether 변수타입으로 되어있지만 partner에 들어간 객체는 Factory를 상속받은 하위객체라 Factory의 모든 정보를 가지고 있어 
												// 형변환이 가능할거 같아서 Factory 변수타입의 partnerName 이름의 변수를 만들고 partner를 Factory로 형변환을 시켜서 partnerName에 저장한다
		
		System.out.println("1. 하루생산량 = "+mainFactory.makeProducts(mainFactorySkill));
		System.out.println("2. 파트너 공장 ["+partnerName.getFactoryName()+"] 협력 시 추가 생산량 = "+partner.workTogether(partner));
		
		System.out.println("--------------------------------------------------------------");
	}

}