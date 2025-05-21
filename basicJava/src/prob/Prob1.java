package prob;

public class Prob1{
public static void main(String[] args) {
	Truck truck = new Truck("트럭", 50, 4);
	Bike bike = new Bike("자전거", 10, 2);
	System.out.println(truck.carName + 
		" : 바퀴 " + truck.wheelNumber + "개입니다"); //트럭 : 바퀴 4개입니다  
	System.out.println(bike.carName +
		" : 바퀴 " + bike.wheelNumber + "개입니다"); //자전거: 바퀴 2개입니다 
//	wheelers[1] = bike;	
	for(int i = 0; i < 2; i++){
		truck.speedUp(10); // 트럭의 현재 속도는 100 입니다.
		bike.speedUp(15); // 자전거의 현재 속도는 25 입니다.
		truck.speedDown(20); //트럭의 최저속도위반으로 속도를 50으로 올립니다. 
		bike.speedDown(25);	//자전거의 최저속도위반으로 속도를 10 으로 올립니다. 
		truck.stop(); //정지상태로 속도를 0으로 초기화합니다.  
		bike.stop(); //	정지상태로 속도를 0으로 초기화합니다. 	
	}
}
}

