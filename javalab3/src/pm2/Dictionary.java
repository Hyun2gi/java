//1971040 ������

//�ǽ� 2 : �ѿ�����
package pm2;

public class Dictionary {
	static String[] kor = {"���","�Ʊ�","��","�̷�","���"};
	static String[] eng = {"love", "baby", "money","future", "hope"};
	static final int WORDCOUNT = 5;
	
	public static String korToEngWord(String korWord) {
		for(int i=0;i<WORDCOUNT;i++) {
			if(kor[i].equals(korWord)) {
				return eng[i];
			}
		}
		return null;
	}

}
