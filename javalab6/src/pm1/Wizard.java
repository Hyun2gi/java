//1971040 이현정
//실습 1 : 게임캐릭터 만들기
package pm1;

public class Wizard extends Character {
	private String charName="Wizard";

	@Override
	public void characterSkill() {
		System.out.println("마법 공격이 가능합니다.");

	}
	public void appendCharacter() {
		selectedCharacter.append("+"+charName);
	}

}
