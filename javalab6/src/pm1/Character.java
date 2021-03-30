//1971040 이현정
//실습 1 : 게임캐릭터 만들기
package pm1;

public abstract class Character {
	private String charName;
	StringBuilder selectedCharacter = new StringBuilder();
	
	abstract void characterSkill();
	
	public void appendCharacter() {
		selectedCharacter.append("+"+charName);
	}

}
