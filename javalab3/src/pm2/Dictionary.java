//1971040 이현정

//실습 2 : 한영사전
package pm2;

public class Dictionary {
	static String[] kor = {"사랑","아기","돈","미래","희망"};
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
