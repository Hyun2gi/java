//1971040 이현정
//실습 1 : 게임캐릭터 만들기
package pm1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n;
		StringBuilder str = new StringBuilder();
		while(true) {
			System.out.println("캐릭터를 선택하세요.");
			System.out.println("1.성직자     2.궁수    3.마법사    4.기사");
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
				System.out.println("캐릭터를 변경하시겠습니까?");
				n = sc.next();
				if(n.equals("y")||n.equals("Y")) {
					continue;
					
			}else {
				System.out.println("게임을 종료했습니다.");
				break;
			}
			}
				catch(InputMismatchException e) {
					System.out.println("숫자를 입력하세요!");
				}
				
			}
			
		}

	}


