//1971040 이현정
//실습 1 : 상품정보
package pm1;

public class ConversationBook extends Book {
	public ConversationBook( int i,String d, String m, int p, int I, String t, String a,String lan){
		super(i,d,m,p,I,t,a);
		language = lan;
	}
	private String language;
	
	public void lset(String l) {
		language = l;
	}
	
	public String lget() {
		return language;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("언어>>"+lget());
	}

}
