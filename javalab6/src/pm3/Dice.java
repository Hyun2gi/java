//1971040 ������
// �ǽ� 3 : �ֻ��� ����
package pm3;

public class Dice {
	private int diceNum;
	
	public void setDiceNum() {
		System.out.println("\nDice is rolled.");
		diceNum = (int)(Math.random() * 6)+1;
	}
	public int getDiceNum() {
		return diceNum;
	}

}
