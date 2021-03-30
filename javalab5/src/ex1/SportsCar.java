//예제 1 : 추상클래스
//1971040 이현정
package ex1;

public class SportsCar extends Car {
	
	public SportsCar(String carName) {
		super(carName);
	}

	@Override
	public void speedUp(int step) {
		velocity += (step * 20);

	}

	@Override
	public void speedDown(int step) {
		velocity -= (step * 10);
		
		if(velocity < 0) 
			velocity = 0;

	}

}
