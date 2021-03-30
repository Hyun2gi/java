//1971040 이현정
//실습 3 : 오류수정
package pm3;

public class InterfaceExam {

	public static void main(String[] args) {
		
		Television tv = new Television(Brand.SAMSUNG,"파브",250000, 48);
		Computer computer = new Computer(Brand.SAMSUNG, "시리즈 9", 1800000, 500, 16);
		
		ProductInter[] p = new ProductInter[2];
		p[0] = tv;
		p[1] = computer;
		
		for(int i=0;i<p.length;i++) {
			p[i].displayProductInfo();
		}

	}

}
