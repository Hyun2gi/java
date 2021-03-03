//1971040 이현정
//실습 1 : 상품정보
package pm1;
import java.util.Scanner;

public class ProductInfo {

	public static void main(String[] args) {
		Product p[] = new Product[10];
		int i=0;
		String description,maker,album,artist,title,author,language;
		int price,ISBN;
		Scanner sc = new Scanner(System.in);
		int s;
		while(true) {
			System.out.println("1,2,3선택");
			s = sc.nextInt();
			if(s==3) {
				break;
			}else if(s==1) {
				System.out.println("상품 종류 책1, 음악,2,회화3");
				s = sc.nextInt();
				switch(s) {
				case 1 :
					System.out.println("상품 설명");
					description = sc.next();
					System.out.println("생산자");
					maker = sc.next();
					System.out.println("가격");
					price = sc.nextInt();
					System.out.println("제목");
					title = sc.next();
					System.out.println("저자");
					author = sc.next();
					System.out.println("ISBN");
					ISBN = sc.nextInt();
					p[i] = new Book(i,description,maker, price,ISBN,title, author);
					i++;
					break;
				}
			}else {
				for(int j=0;j<i;j++) {
					p[j].showInfo();
				}
			}
		}
		
			
	

	}
}
