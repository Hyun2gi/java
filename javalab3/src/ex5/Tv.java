//1971040 ������
//���� 5 : Tv Ŭ����
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
		System.out.println(size+"��ġ"+manufature);
	}

}
