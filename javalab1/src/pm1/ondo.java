//1971040 ÀÌÇöÁ¤
//½Ç½À1 : ¼·¾¾, È­¾¾ ¿Âµµº¯È¯
package pm1;

import java.util.Scanner;
public class ondo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String temp_type = scan.next();
		double temp_in = scan.nextDouble();
		double temp_out = 0;
		
		switch(temp_type) {
		case "¼·¾¾" :
			temp_out = temp_in *9.0/5.0+32.0;
			System.out.printf("È­¾¾ ¿Âµµ´Â %.lf\n",temp_out);
			break;
		case "È­¾¾":
			
		}

	}

}
