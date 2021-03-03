// 1971040 이현정

// 실습4 : 사칙연산 클래스
package pm4;

public class Add {
	private int a, b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a+b;
	}

}
