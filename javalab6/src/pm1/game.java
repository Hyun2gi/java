//1971040 ������
//�ǽ� 1 : ����ĳ���� �����
package pm1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n;
		StringBuilder str = new StringBuilder();
		while(true) {
			System.out.println("ĳ���͸� �����ϼ���.");
			System.out.println("1.������     2.�ü�    3.������    4.���");
			Monk m = new Monk();
			Archer a = new Archer();
			Wizard w = new Wizard();
			Knight k = new Knight();
			
			int num;
			try {
				num = sc.nextInt();
				
				switch(num) {
				case 1 : 
					m.characterSkill();
					m.appendCharacter();
					str.append("+monk");
					break;
				case 2 :
					a.characterSkill();
					a.appendCharacter();
					str.append("+archer");
					break;
				case 3 :
					w.characterSkill();
					w.appendCharacter();
					str.append("+wizard");
					break;
				case 4 :
					k.characterSkill();
					k.appendCharacter();
					str.append("+knight");
					break;
				}
				System.out.println(str);
				System.out.println("ĳ���͸� �����Ͻðڽ��ϱ�?");
				n = sc.next();
				if(n.equals("y")||n.equals("Y")) {
					continue;
					
			}else {
				System.out.println("������ �����߽��ϴ�.");
				break;
			}
			}
				catch(InputMismatchException e) {
					System.out.println("���ڸ� �Է��ϼ���!");
				}
				
			}
			
		}

	}


