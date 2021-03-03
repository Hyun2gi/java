/*1971040 이현정

 * 예제3 : dog class(참조 변수의 assignment)
 */
package ex3;

public class DogTest {

	public static void main(String[] args) {
		int a =10, b=20;
		
		Dog d1 = new Dog();
		d1.setName("Happy");
		
		Dog d2 = new Dog();
		d2.setName("Jong");
		
		System.out.println("Before Change  ");
		System.out.println("a의 값은 " + a + " b의 값은 " + b);
		d1.run(); d2.run();
		
		a = b; b = 30;
		d1 = d2; d2.setName("Dot");
		
		System.out.println();
		System.out.println("After Change ");
		System.out.println("a의 값은 " + a + "b의 값은 " + b);
		d1.run(); d2.run();

	}

}
