//1971040 이현정
//실습 1 : 게임캐릭터 만들기
package pm1;

public class Knight extends Character {
	private String charName = "Knight";

	@Override
	public void characterSkill() {
		System.out.println("칼 공격이 가능합니다.");

	}
	public void appendCharacter() {
		selectedCharacter.append("+"+charName);
	}

}
