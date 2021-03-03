//1971040 이현정
//실습 1 : 상품정보
package pm1;

public class Book extends Product {
	public Book(int i, String d, String m, int p, int ISBN, String title, String author){
		super(i,d,m,p);
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
	}
	private int ISBN;
	private String title;
	private String author;
	
	public void ISBNset(int i) {
		ISBN = i;
	}
	
	public int ISBNget() {
		return ISBN;
	}
	
	public void titleset(String i) {
		title = i;
	}
	
	public String titleget() {
		return title;
	}
	public void authorset(String a) {
		author = a;
	}
	
	public String authorget() {
		return author;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("ISBN>>"+ISBNget());
		System.out.println("책 제목>>"+titleget());
		System.out.println("저자>>"+authorget());
	}

}
