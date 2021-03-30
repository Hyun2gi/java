//1917040 ¿Ã«ˆ¡§
//Ω«Ω¿ 3 : ¡¶≥ ∏Ø
package pm3;

public class CompareMethodEx {

	public static void main(String[] args) {
		Pair<String,Integer> p1 = new Pair<> ("±Ë≥≤¡ÿ",3);
		Pair<String,Integer> p2 = new Pair<> ("±Ë≥≤¡ÿ",3);
		
		boolean result = Util.compare(p1,p2);
		System.out.println(result);
		
		Pair<String,String> p3 = new Pair<> ("±Ë≥≤¡ÿ","±Ë≥≤¡ÿ");
		Pair<String,String> p4 = new Pair<> ("±Ë≥≤¡ÿ","¡ÿ≥≤±Ë");
		
		result = Util.compare(p3, p4);
		System.out.println(result);

	}

}
