//1971040 이현정
//예제 5 : HashMap 객체 저장
package ex5;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

public class FileTest4 {
	public void readData() throws IOException, ClassNotFoundException {
		
	}
	
	public void writeData() throws IOException{
		HashMap<String,String> h = new HashMap<String,String>();
		FileOutputStream fo = new FileOutputStream("c:\\javalab\\logdata.dat");
		ObjectOutputStream fout = new ObjectOutputStream(fo);
		Scanner sc = new Scanner(System.in);
		while(true) {
			String num = sc.next();
			String name = sc.next();
			if(num.equals("0")&&name.equals("0")) {
				break;
			}
			h.put(num,name);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 선택하세요.");
		System.out.println("(1) 파일에 저장 (2) 파일에서 데이터 읽기");
		int menu = sc.nextInt();
		
		try {
			if (menu==1) {
				writeData();
			}else if(menu==2) {
				readData();
			}catch(IOException e) {
				System.err.println(e);
			}catch(ClassNotFoundException e) {
				System.err.println(e);
			}
			
			System.out.println("프로그램 종료");
		}

	}

}
