//1917040 이현정
//실습 3 : 제너릭
package pm3;

public class Pair<k,v> {
	k key;
	v value;
	public Pair(k key, v value) {
		this.key = key;
		this.value = value;
	}
	public k getkey() {
		return key;
	}
	public v getvalue() {
		return value;
	}
	public void setkey(k key) {
		this.key = key;
	}
	public void setvalue(v value) {
		this.value = value;
	}
}
