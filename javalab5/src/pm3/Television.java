//1971040 ������
//�ǽ� 3 : ��������
package pm3;

public class Television extends Product {
	int inchSize;
	
	public Television(int inchSize) {
		this.inchSize = inchSize; //�⺻������ product�� ����
	}
	
	
	public Television(Brand company, String name, int price, int inchSize) {
		super(company, name, price);
		this.inchSize = inchSize;
	}

	@Override
	public void displayProductInfo() {
		System.out.println("TV size : " + inchSize + " | ������ : " + company.getValue() + "| ��ǰ�� : " + name + "| ���� : " + price);
	}

}
