//1971040 이현정
//실습 3 : 오류수정
package pm3;

public class Television extends Product {
	int inchSize;
	
	public Television(int inchSize) {
		this.inchSize = inchSize; //기본생성자 product에 생성
	}
	
	
	public Television(Brand company, String name, int price, int inchSize) {
		super(company, name, price);
		this.inchSize = inchSize;
	}

	@Override
	public void displayProductInfo() {
		System.out.println("TV size : " + inchSize + " | 제조사 : " + company.getValue() + "| 제품명 : " + name + "| 가격 : " + price);
	}

}
