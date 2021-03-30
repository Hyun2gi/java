//1971040 이현정
//실습 6 : User 객체 저장
package ex6;
import java.io.*;
import java.util.*;
public class ObjectStreamTest2 {
	public static void writeDataArr()throws IOException{
		Scanner scan = new Scanner(System.in);
		
		User[] arrUser = new User[5];
		FileOutputStream fileos = new FileOutputStream("userInfo.dat");
		ObjectOutputStream objectos= new ObjectOutputStream(fileos);
		
		for(int i=0;i<5;i++) {
			String id = scan.next();
			String name = scan.next();
			int age = scan.nextInt();
			User obj = new User(id,name,age);
			arrUser[i] = obj;
		}
		
		objectos.writeObject(arrUser);
		
		objectos.close();
		scan.close();
	}
	
	public static void readDataArr() throws IOException, ClassNotFoundException{
		FileInputStream fileis = new FileInputStream("userInfo.dat");
		ObjectInputStream objectis = new ObjectInputStream(fileis);
		
		User[] users = (User[])objectis.readObject();
		
		for(User obj:users) {
			System.out.println(obj);
		}
		
		objectis.close();
	}

	public static void main(String[] args) {
		try {
			writeDataArr();
			readDataArr();
	}catch(Exception e) {
		e.printStackTrace();
	}

}
