//1971040 ������
//�ǽ� 3 : ��������
package pm3;

public class InterfaceExam {

	public static void main(String[] args) {
		
		Television tv = new Television(Brand.SAMSUNG,"�ĺ�",250000, 48);
		Computer computer = new Computer(Brand.SAMSUNG, "�ø��� 9", 1800000, 500, 16);
		
		ProductInter[] p = new ProductInter[2];
		p[0] = tv;
		p[1] = computer;
		
		for(int i=0;i<p.length;i++) {
			p[i].displayProductInfo();
		}

	}

}
