// 1971040 ������
// �ǽ�4 : ��Ģ���� Ŭ����
package pm4;
import java.util.Scanner;
public class CalcTest {

	public static void main(String[] args) {
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		String cal = sc.next();
		
		switch(cal) {
		case "*" :
			Mul m = new Mul();
			m.setValue(n1, n2);
			System.out.println(m.caluate());
			break;
		case "+" :
			Add a = new Add();
			a.setValue(n1, n2);
			System.out.println(a.calculate());
			break;
		case "-" :
			Sub s = new Sub();
			s.setValue(n1, n2);
			System.out.println(s.caluate());
			break;
		case "/" :
			Div d = new Div();
			d.setValue(n1, n2);
			System.out.println(d.caluate());
			break;
		
		}
		
	}
}
