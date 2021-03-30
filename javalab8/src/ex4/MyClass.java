//1971040 이현정
//예제 4 : 제너릭 클래스
package ex4;

public class MyClass<T> {
	T val;
	void set(T a) {
		val = a;
	}
	T get() {
		return val;
	}
}
