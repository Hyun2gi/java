//1971040 ������

//�ǽ� 3 : ��������
package pm3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class CartForSongs {
	double sum=0.0;
	double price = 0.0;
	public void getPrice(Song a) {
			price = (a.price)*(a.getmode());
			sum+=price;
	}
	
}


