//1971040 이현정
//실습 1:상품정보
package pm1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class ProductInfo {
	static ArrayList<Product> p = new ArrayList<Product>();
	static int productID = 0;
	static int numberOfProduct = 0;
	static int removedProduct = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while(choice != 5) {
			int type;
			System.out.print("상품 추가(1), 모든 상품 조회(2), 모든 상품 삭제(3), 특정 생산자 상품 삭제(4), 끝내기(5)");
			choice = sc.nextInt();
			System.out.println();
			switch(choice) {
			case 1:
				System.out.print("상품 종류 책(1), 음악CD(2), 회화적(3)>>");
				type = sc.nextInt();
				if(type < 1 || type >3) {
					System.out.println("잘못된 상품 종류입니다.");
					break;
				}
				addProduct(type,sc);
				break;
			case 2:
				if(p.isEmpty()) {
					System.out.println("비어있습니다.");
					break;
				}
				for(int i=0;i<p.size();i++) {
					Product j = p.get(i);
					j.showInfo();
					System.out.println();
				}
				break;
			case 3:
				p.clear();
				System.out.println("모든 상품을 삭제했습니다!");
				break;
			case 4:
				System.out.print("삭제할 생성자 타입 입력>>");
				System.out.print("상품 종류 책(1), 음악CD(2), 회화적(3)>>");
				type = sc.nextInt();
				int i=0;
				if(type==1) {
					Iterator<Product> it = p.iterator();
					while(it.hasNext()) {
						Product pro = (Product)it.next();
						if(pro instanceof Book) {
							it.remove();
							i++;
						}
					}
					if(i==0) {
						System.out.println("해당 상품이 없습니다.");
					}else {
						System.out.printf("상품 %d개를 삭제했습니다.",i);
					}
					
				}else if(type==2) {
					Iterator<Product> it = p.iterator();
					while(it.hasNext()) {
						Product pro = (Product)it.next();
						if(pro instanceof CompactDisc) {
							it.remove();
							i++;
						}
					}
					if(i==0) {
						System.out.println("해당 상품이 없습니다.");
					}else {
						System.out.printf("상품 %d개를 삭제했습니다.",i);
					}
				}else {
					Iterator<Product> it = p.iterator();
					while(it.hasNext()) {
						Product pro = (Product)it.next();
						if(pro instanceof ConversationBook) {
							it.remove();
							i++;
						}
					}
					if(i==0) {
						System.out.println("해당 상품이 없습니다.");
					}else {
						System.out.printf("상품 %d개를 삭제했습니다.",i);
					}
				}
				break;
			case 5:
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");
			}
			System.out.println();
		}
		System.out.println("***The End***");
	}
	private static void addProduct(int type, Scanner sc) {
		System.out.print("상품 설명>>");
		String desc = sc.next();
		System.out.print("생산자>>");
		String maker = sc.next();
		System.out.print("가격>>");
		int price = sc.nextInt();
		sc.nextLine();
		switch(type) {
		case 1 :
			System.out.print("책 제목>>");
			String title = sc.next();
			System.out.print("저자>>");
			String author = sc.next();
			System.out.print("ISBN>>");
			int ISBN = sc.nextInt();
			p.add(new Book(productID++,desc,maker,price,ISBN,title,author));
			break;
		case 2 :
			System.out.print("앨범 제목>>");
			String albumTitle = sc.next();
			System.out.print("가수>>");
			String artist = sc.next();
			p.add(new CompactDisc(productID++,desc,maker,price,albumTitle,artist));
			break;
		case 3 :
			System.out.print("책 제목>>");
			String title2 = sc.next();
			System.out.print("저자>>");
			String author2 = sc.next();
			System.out.print("언어>>");
			String language = sc.next();
			System.out.println("ISBN >>");
			int ISBN2 = sc.nextInt();
			p.add(new ConversationBook(productID++,desc,maker,price,ISBN2,title2,author2,language));
			break;
		}
		numberOfProduct++;
	}
}

