//1971040 ������
//�ǽ� 1 : ��ǰ����
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
			System.out.println("1,2,3����");
			s = sc.nextInt();
			if(s==3) {
				break;
			}else if(s==1) {
				System.out.println("��ǰ ���� å1, ����,2,ȸȭ3");
				s = sc.nextInt();
				switch(s) {
				case 1 :
					System.out.println("��ǰ ����");
					description = sc.next();
					System.out.println("������");
					maker = sc.next();
					System.out.println("����");
					price = sc.nextInt();
					System.out.println("����");
					title = sc.next();
					System.out.println("����");
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
