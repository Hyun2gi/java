//1917040 ������
//�ǽ� 3 : ���ʸ�
package pm3;

public class CompareMethodEx {

	public static void main(String[] args) {
		Pair<String,Integer> p1 = new Pair<> ("�賲��",3);
		Pair<String,Integer> p2 = new Pair<> ("�賲��",3);
		
		boolean result = Util.compare(p1,p2);
		System.out.println(result);
		
		Pair<String,String> p3 = new Pair<> ("�賲��","�賲��");
		Pair<String,String> p4 = new Pair<> ("�賲��","�س���");
		
		result = Util.compare(p3, p4);
		System.out.println(result);

	}

}
