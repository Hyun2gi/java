//1971040 이현정
//실습 2 : 강아지 정보 저장
package pm2;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class FileTest {
	public static void writeData(String s) throws IOException {
		FileOutputStream fileos = new FileOutputStream(s);
		ObjectOutputStream objectos = new ObjectOutputStream(fileos);
		Dog myDog[] = new Dog[10];
		myDog[0] = new Dog("Merry",3,2.5,"Bulldog",false);
		myDog[1] = new Dog("JJong",5,5.5,"Mix",false);
		myDog[2] = new Dog("Kong",4,2.5,"Poodie",true);
		myDog[3] = new Dog("Apple",2,2.5,"Collie",true);
		myDog[4] = new Dog("Candy",5,2.5,"Coca",false);
		myDog[5] = new Dog("Cutie",7,2.5,"Chiwawa",true);
		myDog[6] = new Dog("Peace",3,2.5,"Huskey",false);
		myDog[7] = new Dog("Lion",9,2.5,"Shepard",true);
		myDog[8] = new Dog("Windy",2,2.5,"Jindo",true);
		myDog[9] = new Dog("Sweetie",1,2.5,"Maltiz",false);
		objectos.writeObject(myDog);
		fileos.close();
		objectos.close();
	}
	public static void readData(String s) throws IOException, ClassNotFoundException {
		FileInputStream fileis = new FileInputStream(s);
		ObjectInputStream objectis = new ObjectInputStream(fileis);
		Dog[] doges = (Dog[])objectis.readObject();
		for(Dog dogg : doges) {
			System.out.println(dogg);
		}
		
		objectis.close();
		
	}
	public static void readData2(String s) throws IOException, ClassNotFoundException {
		FileInputStream fileis = new FileInputStream(s);
		ObjectInputStream objectis = new ObjectInputStream(fileis);
		Dog[] doges = (Dog[])objectis.readObject();
		for(Dog dogg : doges) {
			if(dogg.getAge()>=2&&dogg.getBoosterShot()==false) {
				System.out.println(dogg.getName()+"    "+dogg.getBreed());
			}
		}	
		objectis.close();
		
	}
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Input File name to write Dog data");
			String s = sc.next();
			writeData(s);
			System.out.println("name    age   weight  breed   BoosterShot");
			readData(s);
			System.out.println("Dogs older than 2 years and did not get te booseterShot");
			readData2(s);
	}catch(Exception e) {
		e.printStackTrace();
		
	}

}
}
