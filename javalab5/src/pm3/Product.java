//1971040 ������
//�ǽ� 3 : ��������
package pm3;

abstract class Product implements ProductInter { 
	/*�� abstract class�ϱ�?  >> interface���� abstract �޼��尡 ���� �Ǿ��µ� �� �޼��带 �� Ŭ���� ������ ���Ǹ� ���ϸ�
	 * �ڵ����� abstract�޼��带 ������ �ְ� �Ǵ� ���̰� �ٽ� ���� �������� �Ѱ��� abstract �޼��带 ������ �־ abstract class�� �ȴ�.
	 * */
	Brand company;
	String name;
	int price;
	
	public Product() {
		
	}

	public Product(Brand company, String name, int price) {
		this.company = company;
		this.name = name;
		this.price = price;
		
	}

}
