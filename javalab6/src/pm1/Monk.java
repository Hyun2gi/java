//1971040 ������
//�ǽ� 1 : ����ĳ���� �����
package pm1;

public class Monk extends Character {
	private String charName = "Monk";

	@Override
	public void characterSkill() {
		System.out.println("������ �����մϴ�.");
	}
	public void appendCharacter() {
		selectedCharacter.append("+"+charName);
	}

}
