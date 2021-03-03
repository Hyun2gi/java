//1971040 이현정
//실습1 : 상품 정보
package pm1;

public class Product {
	public Product(int ID,String d, String m, int pri) {
		productID =ID;
		description = d;
		maker = m;
		price = pri;		
	}
	private int productID;
	private String description;
	private String maker;
	private int price;
	

	
	public void productsetters(int p) {
		productID = p;
	}
	public void dsetters(String d) {
		description = d;
	}
	public void makersetters(String m) {
		maker = m;
	}
	public void pricesetters(int pri) {
		price = pri;
	}
	
	public int productget() {
		return productID;
	}
	public String dget() {
		return description;
	}
	public String mget() {
		return maker;
	}
	public int priceget() {
		return price;
	}
	
	public void showInfo() {
		System.out.println("상품ID>>"+productget());
		System.out.println("상품설명>>"+dget());
		System.out.println("생산자>>"+mget());
		System.out.println("가격>>"+priceget());
	}

}
