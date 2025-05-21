package oop.polymorphism.chap07.inter;

public class AnimalTest {
	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		
//		위에서 생성한 Chicken Object가 Cheatable 하다면 fly 함수를 호출합니다. 단, 
//		Cheatable 여부의 판단을 위해서는 반드시 생성된 Object의 타입 검사를 수행해야 합니다. 
		
//		이건 잘 모르겠다.... 한번 더 보고 이해하려고 해보자..	
		Chicken cheatableChicken = new Chicken(5);	
		if(cheatableChicken instanceof Chicken){
			cheatableChicken.fly();
		}

//		내가 헤멧던 이유는 run 값을 넣으면 값이 리턴되어서 그냥 나오는 줄 알았는데 내가 만든 run은 값만 초기화하고 값은 변환이 안되는 거다.
//		그래서 값이 나오게 하는 getdistance 값을 넣어 값이 나오게 한다.
//      값을 반환하게 만들려고 하면 animal에 있던 run 변수 타입을 void가 아니라 double 값을 넣어 return 하게 하던가 해야하지 않을까 싶다.
		
//		3시간 동안 매 시간마다 각 객체들의 이동거리 정보가 아래와 같이 출력되도록 합니다. 
		for(int i=1; i<=3;i++) {
			dog.run(1);                 //1를 넣은 이유는 이미 메소드에 누적하게 코드를 짰다
			chicken.run(1);             //근데 i를 넣으면 또 3번 반복한 값이 나오니 1을 넣어야한다.
			cheatableChicken.run(1);    //run 값을 넣고 먼저 넣은 이유는 run을 안넣으면 이동거리를 계산이 안된다 그러면 처음 이동거리가 0으로 나온다.
			System.out.println(i+"시간 후");
			System.out.println("개의 이동거리="+dog.getDistance()); // 결과값을 반환되어서 나타내는 코드
			System.out.println("닭의 이동거리="+chicken.getDistance());
			System.out.println("날으는 닭의 이동거리="+cheatableChicken.getDistance());
			System.out.println();
		}
		
	}
	
}













