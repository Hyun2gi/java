//1971040 ������

//���� 3 : �������, 500�ʴ� �� �ð� �� ��, �� ���ΰ�. 
package ex3;

import java.util.Scanner;

public class cal {

	public static void main(String[] args) {
		String type;
		Scanner sc = new Scanner(System.in);
		double ondo;
		type = sc.next();
		ondo = sc.nextInt();
		switch(type) {
		case "����" :
			ondo = ondo*9.0/5.0 + 32.0;
			
			break;
		case "ȭ��" :
			ondo = (ondo-32.0)*5.0/9.0;
			break;
		}
		System.out.println("%s �µ��� %f",);
		
	}

}
