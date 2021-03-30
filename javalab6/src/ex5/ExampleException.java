//1971040 ������
//����5: ����ó��
package ex5;

class MyException extends Exception {
	@Override
	public String getMessage() {
		return "Negative Integer!!";
	}
}

class MyRuntimeException extends RuntimeException {
	public MyRuntimeException(String errmsg) {
		super(errmsg);
	}
}

class ExceptionTest{
	public void foo(int n) throws MyException{
		if(n<0) throw new MyException();
		else System.out.println("foo(int): " + n);
	}
	public void goo(int n) throws MyRuntimeException{
		if(n<0) throw new MyRuntimeException("������ �Ű������� ���� �� ����.");
		else System.out.println("goo(int): " + n);
	}
}

public class ExampleException {

	public static void main(String[] args) {
		ExceptionTest obj = new ExceptionTest();
		try {
			obj.foo(-10);;
		}catch(MyException e){
			System.out.println(e.getMessage());
		}
		
		try {
			obj.goo(-1);;
		}catch(MyRuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		obj.goo(-1);

	}

}
