/*1971040 ������

 * ����4 : dog class(�޼ҵ� ���� ����)
 */
package ex4;

public class TestParameter {

	public static void main(String[] args) {
		int intSize = 50;
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		d1.setName("Happy");
		d1.setSize(25);
		
		d1.tryToChange(intSize);
		System.out.println("\n === tryToChange Retult In main ===");
		System.out.println("       intSize value?" + intSize);
		
		d1.tryToReplace(d2);
		System.out.println("\n === tryToChange Retult In main ===");
		System.out.println("       d1 run() ==> ");
		d1.run();
		System.out.println("       d2 run() ==> ");
		d2.run();

	}

}
