//1971040 ������
//�ǽ� 1 : ����ĳ���� �����
package pm1;

public class Archer extends Character {
	private String charName = "Archer";

	@Override
	public void characterSkill() {
		System.out.println("ȭ�� ������ �����մϴ�.");

	}
	public void appendCharacter() {
		selectedCharacter.append("+"+charName);
	}

}
