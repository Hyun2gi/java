/*1971040 ÀÌÇöÁ¤

 * ¿¹Á¦2 : dog class(Ä¸½¶È­)
 */
package ex2;

public class DogTest {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setSize(30);
		d.bark(3);
		d.setSize(0);
		d.bark(3);
		d.setSize(15);
		d.bark(3);
		d.setSize(50);
		d.bark(3);
		
		System.out.println("Dog one: " + d.getSize());

	}

}
