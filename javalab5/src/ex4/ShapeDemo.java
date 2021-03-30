//1971040 이현정
//예제 4 : 인터페이스
package ex4;

public class ShapeDemo {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(3,4);
		Rectangle r1 = new Rectangle(4,5);
		ColorTriangle ct1  = new ColorTriangle(6,7,"red");
		Rectangle2 r2 = new Rectangle2(7);
		Rectangle r3 = new Rectangle(10,12);
		
		ShapesInterface s[] = new ShapesInterface[5];
		
		s[0] = t1;
		s[1] = r1;
		s[2] = r2;
		s[3] = r3;
		s[4] = ct1;
		
		for(int i=0;i<s.length;i++) {
			s[i].computerArea();
			s[i].show();
		}
		
		System.out.println("------------------");
		System.out.println("Rectangle 만 출력");
		for(int i=0;i<s.length;i++) {
			if(s[i] instanceof Rectangle) s[i].show();
		}
		
		System.out.println("------------------");
		System.out.println("ColorTriangle 만 출력");
		for(int i=0;i<s.length;i++) {
			if(s[i] instanceof ColorTriangle) s[i].show();
		}
		
		System.out.println("------------------");
		System.out.println("Triangle 만 출력");
		for(int i=0;i<s.length;i++) {
			if(s[i] instanceof Triangle && !(s[i] instanceof ColorTriangle)) s[i].show();
		}
		
		

	}

}
