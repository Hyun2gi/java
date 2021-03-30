//1971040 이현정
//실습 3 : 오류수정
package pm3;

public class Computer extends Product {
	
	int hddSize;
	int memorySize;

	@Override
	public void displayProductInfo() {
		System.out.println("Computer 제조사 : " + company.getValue() + " | 제품명 : " + name + "| 가격 : " + price + "| hddSize : " + hddSize
				+"| GB : memorySize : " + memorySize + "GB");

	}
	
	public Computer(Brand company, String name, int price, int hddSize, int memorySize) {
		super(company,name,price);
		this.hddSize = hddSize;
		this.memorySize = memorySize;
	}

}
