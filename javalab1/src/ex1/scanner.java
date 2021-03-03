//1971040 이현정

//예제1 : scanner 사용 , 이름, 도시, 나이, 체중 독립여부를 입력 받고 다시 출력
package ex1;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 비난으로 분리하여 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.print("이름은" + name + ",");
		
		String city = scanner.next();
		System.out.print("도시는" + city + ",");
		
		int age = scanner.nextInt();
		System.out.print("나이는" + city + ",");
		
		double weight = scanner.nextDouble();
		System.out.print("체중은" + weight + ",");
		
		boolean single = scanner.nextBoolean();
		System.out.print("독립 여부는" + single + ",");
		
		scanner.close();

	}

}
