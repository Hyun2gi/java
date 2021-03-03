//1971040 이현정
//예지 1 : final modifier
package ex1;

public class MySoft {
	private String softName;
	private int softCost;
	
	private final int softTax = 10;
	
	public static int softTotal = 0;
	
	public void setSoftName(String softName) {
		this.softName = softName;
	}
	
	public void setSoftCost(int cost) {
		//softTax = 20;
		softCost = cost + (cost/100 * softTax);
		softTotal = softTotal + softCost;
	}
	
	public String getsoftName() {
		return softName;
	}
	public int getSoftCost() {
		return softCost;
	}
	

}
