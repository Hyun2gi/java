/*1971040 ÀÌÇöÁ¤

 * ¿¹Á¦3 : dog class(ÂüÁ¶ º¯¼öÀÇ assignment)
 */
package ex3;

public class Dog {
	private int size;
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setSize(int size) {
		if(size > 10) this.size = size;
	}
	
	public void bark() {
		System.out.println("¸Û!¸Û!¸Û!");
		}
	
	public void run() {
		System.out.println(name + " is running");
	}

}
