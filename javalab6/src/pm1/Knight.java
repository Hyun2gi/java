//1971040 ������
//�ǽ� 1 : ����ĳ���� �����
package pm1;

public class Knight extends Character {
	private String charName = "Knight";

	@Override
	public void characterSkill() {
		System.out.println("Į ������ �����մϴ�.");

	}
	public void appendCharacter() {
		selectedCharacter.append("+"+charName);
	}

}
