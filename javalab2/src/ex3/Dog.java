/*1971040 ������

 * ����3 : dog class(���� ������ assignment)
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
		System.out.println("��!��!��!");
		}
	
	public void run() {
		System.out.println(name + " is running");
	}

}
