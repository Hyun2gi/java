//1971040 ������
//�ǽ� 1 : ����ĳ���� �����
package pm1;

public abstract class Character {
	private String charName;
	StringBuilder selectedCharacter = new StringBuilder();
	
	abstract void characterSkill();
	
	public void appendCharacter() {
		selectedCharacter.append("+"+charName);
	}

}
