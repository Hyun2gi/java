//1971040 ������
//�ǽ� 3 : ��������
package pm3;

public class Computer extends Product {
	
	int hddSize;
	int memorySize;

	@Override
	public void displayProductInfo() {
		System.out.println("Computer ������ : " + company.getValue() + " | ��ǰ�� : " + name + "| ���� : " + price + "| hddSize : " + hddSize
				+"| GB : memorySize : " + memorySize + "GB");

	}
	
	public Computer(Brand company, String name, int price, int hddSize, int memorySize) {
		super(company,name,price);
		this.hddSize = hddSize;
		this.memorySize = memorySize;
	}

}
