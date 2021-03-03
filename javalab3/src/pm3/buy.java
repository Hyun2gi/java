//1971040 이현정

//실습 3 : 음원구매
package pm3;
import java.util.Scanner;

public class buy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String title;
		String singer;
		int price;
		int mode;
		int i=0;
		CartForSongs b = new CartForSongs();
		System.out.print("Input User >> ");
		name = sc.next();
		
		System.out.println("Start Shopping - Cart of"+name);
		while(true) {
			System.out.print("Input Song Information(title singer price) >> ");
			title = sc.next();
			singer = sc.next();
			price = sc.nextInt();
			Song a;
			if(title.equals("그만")&&singer.equals("0")&&price==0) {
				break;
			}else {
				a = new Song(title,singer,price);
			}
			System.out.println("Input Sale Mode(NonDiscounted(1) or OnSale(2) or TodayEvent(3) ) >>");
			mode = sc.nextInt();
			a.setmode(mode);
			a.getmode();
			b.getPrice(a);
		}
		
		System.out.println("Total Price"+"("+name+"): "+ b.sum);
		
		

	}

}
