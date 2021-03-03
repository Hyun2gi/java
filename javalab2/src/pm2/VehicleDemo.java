// 1971040 이현정

// 실습2 : 차량연비관리
package pm2;

public class VehicleDemo {

	public static void main(String[] args) {
		Vehicle minivan = new Vehicle(7,16,21);
		Vehicle sportscar = new Vehicle(2,14,12);
		
		System.out.println("미니벤은 252 마일을 가기 위해 " + minivan.fuelneeded(252) +"갤런의 연료가 필요하다.");
		System.out.println("스포츠카은 252 마일을 가기 위해 " + sportscar.fuelneeded(252) +"갤런의 연료가 필요하다.");
		System.out.printf("미니벤은 현재 %d마일을 주행할 수 있다.\n", minivan.range());
		System.out.printf("스포츠카은 현재 %d마일을 주행할 수 있다.", sportscar.range());

	}

}
