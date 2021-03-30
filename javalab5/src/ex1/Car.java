//예제 1 : 추상클래스
//1971040 이현정
package ex1;

public abstract class Car {
	protected int velocity;
	private int wheelNum;
	String carName;
	
	public Car(int wheelNum, String carName) {
		this.wheelNum = wheelNum;
		this.carName = carName;
	}
	
	public Car(String carName) {
		this(4, carName);
	}
	
	public abstract void speedUp(int step);
	
	public abstract void speedDown(int step);
	
	public void stop() {
		velocity = 0;
	}
	
	int getVelocity() {
		return velocity;
	}
	
	int getWheelNum() {
		return wheelNum;
	}
}
