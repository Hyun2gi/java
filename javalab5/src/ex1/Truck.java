//예제 1 : 추상클래스
//1971040 이현정
package ex1;

public class Truck extends Car {
	
	public Truck(int wheelNum, String carName) {
		super(wheelNum, carName);
	}
	
	public Truck(String carName) {
		super(carName);
	}

	@Override
	public void speedUp(int step) {
		velocity += (step * 20);
		
		if(velocity > 100) {
			velocity = 100;
		}
	}

	@Override
	public void speedDown(int step) {
		velocity -= (step * 5);
		
		if(velocity < 0)
			velocity = 0;

	}
	
	public String toString() {
		String str = "This truck is " + carName + ".";
		return str;
	}

}
