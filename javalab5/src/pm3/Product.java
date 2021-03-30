//1971040 이현정
//실습 3 : 오류수정
package pm3;

abstract class Product implements ProductInter { 
	/*왜 abstract class일까?  >> interface에서 abstract 메서드가 정의 되었는데 그 메서드를 이 클래스 내에서 정의를 안하면
	 * 자동으로 abstract메서드를 가지게 있게 되는 것이고 다시 정의 안했으니 한개라도 abstract 메서드를 가지고 있어서 abstract class가 된다.
	 * */
	Brand company;
	String name;
	int price;
	
	public Product() {
		
	}

	public Product(Brand company, String name, int price) {
		this.company = company;
		this.name = name;
		this.price = price;
		
	}

}
