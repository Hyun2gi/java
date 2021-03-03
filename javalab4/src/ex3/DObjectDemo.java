//1971040 이현정
//예제3 : 도형연결
package ex3;

public class DObjectDemo {

	public static void main(String[] args) {
		DObject start, n, obj;
		start = new Line();
		n = start;
		obj = new Rect();
		n.next = obj;
		n = obj;
		obj = new Line();
		n.next = obj;
		n = obj;
		obj = new Circle();
		n.next = obj;
		
		while(start !=null) {
			start.draw();
			start = start.next;
		}

	}

}
