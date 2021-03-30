//1971040 이현정
//실습 3 : 오류수정
package pm3;

public enum Brand {
	SAMSUNG("삼성"), LG("엘지전자"), SONYX("소니"), PANA("파나소닉");
	
	
	private String value;
	
	private Brand(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

}
