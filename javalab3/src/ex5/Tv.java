//1971040 이현정
//예지 5 : Tv 클래스
package ex5;

public class Tv {
	private int size;
	private String manufacture;
	public Tv() {
		this(32,"LG");
	}
	
	public Tv(String manufacture) {
		this(32, manufacture);
	}
	public Tv(int size, String manufacture) {
		this.size = 32;
		this.manufacture = manufacture;
		System.out.println(size+"인치"+manufature);
	}

}
