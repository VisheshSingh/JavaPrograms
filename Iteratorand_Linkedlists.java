import java.util.LinkedList;
import java.util.Iterator;

public class Iteratorand_Linkedlists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> LL = new LinkedList<String>();
		LL.add("Vishesh");
		LL.add("babu");
		LL.add("Shikha");
		LL.add("Papa");
		LL.add("mummy");
		
		Iterator it = LL.iterator();
		while(it.hasNext())
				{
					System.out.println(it.next());
				}
		
	}

}
