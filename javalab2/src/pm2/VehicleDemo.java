// 1971040 ������

// �ǽ�2 : �����������
package pm2;

public class VehicleDemo {

	public static void main(String[] args) {
		Vehicle minivan = new Vehicle(7,16,21);
		Vehicle sportscar = new Vehicle(2,14,12);
		
		System.out.println("�̴Ϻ��� 252 ������ ���� ���� " + minivan.fuelneeded(252) +"������ ���ᰡ �ʿ��ϴ�.");
		System.out.println("������ī�� 252 ������ ���� ���� " + sportscar.fuelneeded(252) +"������ ���ᰡ �ʿ��ϴ�.");
		System.out.printf("�̴Ϻ��� ���� %d������ ������ �� �ִ�.\n", minivan.range());
		System.out.printf("������ī�� ���� %d������ ������ �� �ִ�.", sportscar.range());

	}

}
