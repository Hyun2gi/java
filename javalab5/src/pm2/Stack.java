//1971040 이현정
//실습 2: 스택 구현
package pm2;

public interface Stack {
	Boolean isEmpty();
	Boolean isFull();
	void push(Object item);
	Object pop();
	Object peek();
	void clear();

}
