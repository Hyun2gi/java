package test;

public class Test {
	static public int f(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		int sum = Test.f(2,4);
		System.out.println(sum);
	}

}
