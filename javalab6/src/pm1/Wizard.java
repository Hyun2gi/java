//1971040 ������
//�ǽ� 1 : ����ĳ���� �����
package pm1;

public class Wizard extends Character {
	private String charName="Wizard";

	@Override
	public void characterSkill() {
		System.out.println("���� ������ �����մϴ�.");

	}
	public void appendCharacter() {
		selectedCharacter.append("+"+charName);
	}

}
