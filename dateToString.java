import java.util.Date;
import java.text.SimpleDateFormat;

public class dateToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		System.out.println("today: "+ today);
		
		SimpleDateFormat sdr = new SimpleDateFormat("yyyy-MM-dd");
		String s1 = sdr.format(today);
		System.out.println(s1);
		
		SimpleDateFormat sdr1 = new SimpleDateFormat("dd-MMMM-yy");
		String s2 = sdr1.format(today);
		System.out.println(s2);
	}

}
