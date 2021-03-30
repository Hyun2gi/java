//예제 1 : 추상클래스
//1971040 이현정
package ex1;

public class CarUI {

	public static void main(String[] args) {
		Car arrCar[] = new Car[3];
		arrCar[0] = new Truck(5,"lys-Volvo");
		arrCar[1] = new SportsCar("lys-Ferrari");
		arrCar[2] = new SportsCar("jam-Ferrari");
		
		for(int i=0; i< arrCar.length; i++) {
			for(int j=0;j<10;j++) {
				arrCar[i].speedUp(j);
			}
			printSpeed(arrCar[i]);
		}
		for(int i=0;i<arrCar.length;i++) {
			for(int j=0 ; j<5;j++) {
				arrCar[i].speedDown(j);
			}
			printSpeed(arrCar[i]);
		}
		
		for(int i=0;i<arrCar.length;i++) {
			System.out.println(i + ":" + arrCar[i].toString());
		}

	}
	
	public static void printSpeed(Car obj) {
		if(obj instanceof Truck) {
			System.out.println("Truck 현재속도 :"+obj.getVelocity());
		}
		else if(obj instanceof SportsCar) {
			System.out.println("SportsCar 현재속도:" + obj.getVelocity());
		} else {
			System.out.println("차가 아닙니다.");
		}
		
		System.out.println("*******************");
	}

}
