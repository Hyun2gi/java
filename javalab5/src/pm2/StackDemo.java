//1971040 ������
//�ǽ� 2: ���� ����
package pm2;

public class StackDemo {

	public static void main(String[] args) {
		int stackSize = 5;
		StringStack arrStack = new StringStack(stackSize);
		
		arrStack.push("Ewha");
		arrStack.printStack();
		System.out.println();
		
		arrStack.push("Womans");
		arrStack.printStack();
		System.out.println();
		
		arrStack.push("University");
		arrStack.printStack();
		System.out.println();
		
		arrStack.pop();
		arrStack.printStack();
		System.out.println();
		
		arrStack.pop();
		arrStack.printStack();
		System.out.println();
		
		arrStack.peek();
		arrStack.printStack();
		System.out.println();
		
		arrStack.clear();
		arrStack.printStack();
		

	}

}