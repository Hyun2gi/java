//1971040 이현정
//실습 2: 스택 구현
package pm2;

public class StringStack implements Stack {
	
	int size;
	String s[];
	int i=0;
	
	public StringStack(int size) {
		this.size = size;
		s = new String[size];
	}

	@Override
	public Boolean isEmpty() {
		if(s==null) return true;
		else return false;
	}

	@Override
	public Boolean isFull() {
		if(i+1==size)return true;
		else return false;
	}

	@Override
	public void push(Object item) {
		if(isFull()) {
			System.out.println("stack is full");
		}else {
			System.out.println("Inserted Item(push) : "+ item);
			s[i] = (String)item;
			i++;
		}
	}

	@Override
	public Object pop() {
		System.out.println("Deleted item : "+s[i-1]);
		Object a  = s[i-1];
		s[i-1] = null;
		i--;
		return a;
	}

	@Override
	public Object peek() {
		System.out.println("Peeked Item : "+ s[i-1]);
		return s[i-1];
	}

	@Override
	public void clear() {
		s = null;
		System.out.println("Stack is clear!");

	}
	
	public void printStack() {
		if (isEmpty()) {
			System.out.println("Stack is Empty!");
		}else {
			System.out.print("Stack elements : ");
			for(int j=0;j<i;j++) {
				System.out.print(s[j]+" ");
			}
			System.out.println();
		}
		
	}

}
