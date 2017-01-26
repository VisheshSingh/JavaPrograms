import java.util.ArrayList;
import java.util.Collections;

public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(45);
		list.add(12);
		list.add(1);
		
		int max=Collections.max(list);
		
		System.out.println(max);

	}

}
