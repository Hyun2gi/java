//1971040 ������

//�ǽ� 3 : ��������
package pm3;

public class Song {
	private int mode=0;
	String name;
	String singer;
	int price;
	public Song(String singer, int price) {
		this("�͸�",singer,price);
	}
	public Song(String name, String singer) {
		this(name, singer, 10);
	}
	public Song(String name, String singer, int price) {
		this.name = name;
		this.singer = singer;
		this.price = price;
	}
	public void setmode(int m) {
		mode = m;
	}
	public double getmode() {
		switch(mode) {
		case 1 :
			return 1;
		case 2 :
			return 0.9;
		case 3 :
			return 0.7;
		default :
			return 1;
		}
	}
	

}
