//1971040 ������
//���� 5 : ����Ÿ��
package ex5;

public enum Currency {
	DOLLAR(1194.90), EURO(1312.48), YEN(11.11), YUAN(167.96);
	private double value;
	
	private Currency(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return value;
	}

}
