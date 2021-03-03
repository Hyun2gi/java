//1971040 이현정
//실습 1 : 상품정보
package pm1;

public class CompactDisc extends Product {
	public CompactDisc(int i,String d, String m, int p,String albumTitle, String artist){
		super(i,d,m,p);
		this.albumTitle = albumTitle;
		this.artist = artist;
	}
	private String albumTitle;
	private String artist;
	public void titleset(String i) {
		albumTitle = i;
	}
	
	public String titleget() {
		return albumTitle;
	}
	public void artistset(String a) {
		artist = a;
	}
	
	public String artistget() {
		return artist;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("앨범 제목>>"+titleget());
		System.out.println("가수>>"+artistget());
	}

}
