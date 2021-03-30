//1971040 ������
//�ǽ� 1:��ǰ����
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
			System.out.print("��ǰ �߰�(1), ��� ��ǰ ��ȸ(2), ��� ��ǰ ����(3), Ư�� ������ ��ǰ ����(4), ������(5)");
			choice = sc.nextInt();
			System.out.println();
			switch(choice) {
			case 1:
				System.out.print("��ǰ ���� å(1), ����CD(2), ȸȭ��(3)>>");
				type = sc.nextInt();
				if(type < 1 || type >3) {
					System.out.println("�߸��� ��ǰ �����Դϴ�.");
					break;
				}
				addProduct(type,sc);
				break;
			case 2:
				if(p.isEmpty()) {
					System.out.println("����ֽ��ϴ�.");
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
				System.out.println("��� ��ǰ�� �����߽��ϴ�!");
				break;
			case 4:
				System.out.print("������ ������ Ÿ�� �Է�>>");
				System.out.print("��ǰ ���� å(1), ����CD(2), ȸȭ��(3)>>");
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
						System.out.println("�ش� ��ǰ�� �����ϴ�.");
					}else {
						System.out.printf("��ǰ %d���� �����߽��ϴ�.",i);
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
						System.out.println("�ش� ��ǰ�� �����ϴ�.");
					}else {
						System.out.printf("��ǰ %d���� �����߽��ϴ�.",i);
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
						System.out.println("�ش� ��ǰ�� �����ϴ�.");
					}else {
						System.out.printf("��ǰ %d���� �����߽��ϴ�.",i);
					}
				}
				break;
			case 5:
				break;
			default :
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			System.out.println();
		}
		System.out.println("***The End***");
	}
	private static void addProduct(int type, Scanner sc) {
		System.out.print("��ǰ ����>>");
		String desc = sc.next();
		System.out.print("������>>");
		String maker = sc.next();
		System.out.print("����>>");
		int price = sc.nextInt();
		sc.nextLine();
		switch(type) {
		case 1 :
			System.out.print("å ����>>");
			String title = sc.next();
			System.out.print("����>>");
			String author = sc.next();
			System.out.print("ISBN>>");
			int ISBN = sc.nextInt();
			p.add(new Book(productID++,desc,maker,price,ISBN,title,author));
			break;
		case 2 :
			System.out.print("�ٹ� ����>>");
			String albumTitle = sc.next();
			System.out.print("����>>");
			String artist = sc.next();
			p.add(new CompactDisc(productID++,desc,maker,price,albumTitle,artist));
			break;
		case 3 :
			System.out.print("å ����>>");
			String title2 = sc.next();
			System.out.print("����>>");
			String author2 = sc.next();
			System.out.print("���>>");
			String language = sc.next();
			System.out.println("ISBN >>");
			int ISBN2 = sc.nextInt();
			p.add(new ConversationBook(productID++,desc,maker,price,ISBN2,title2,author2,language));
			break;
		}
		numberOfProduct++;
	}
}

