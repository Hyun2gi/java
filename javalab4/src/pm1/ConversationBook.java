//1971040 ������
//�ǽ� 1 : ��ǰ����
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
		System.out.println("���>>"+lget());
	}

}
