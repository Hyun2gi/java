//1971040 ������
// �ǽ� 3 : �ֻ��� ����
package pm3;
import java.util.Scanner;

public class Person {
	
	Scanner kbd;
	
	private int guessNum;
	private char ID;
	
	Person(char ID, Scanner sc) {
		this.ID = ID;
		kbd = sc;
	}
	
	public int getGuessNum() {
		return guessNum;
	}
	
	public void inputGuessNum() {
		try {
			kbd = new Scanner(System.in);
			System.out.println("�����غ�����.");
			guessNum = kbd.nextInt();
			if(guessNum<0||guessNum>6) throw new GuessNumException();
		}
		catch(GuessNumException e) {
			while(guessNum<0||guessNum>6) {
				System.out.println(e.getMessange());
				guessNum = kbd.nextInt();
			}
		}
	}

}
