//1971040 ������
//�ǽ� 3 : ��������
package pm3;

public enum Brand {
	SAMSUNG("�Ｚ"), LG("��������"), SONYX("�Ҵ�"), PANA("�ĳ��Ҵ�");
	
	
	private String value;
	
	private Brand(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

}
