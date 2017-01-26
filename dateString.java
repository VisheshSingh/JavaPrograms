import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class dateString
{
  public static void main(String args[]) throws ParseException
  {
    SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");  // pass any format you like
	    // take input from keyboard or from GUI, the date from the user. Say the user enters 12-06-2013	      
    Date today1 = sdf1.parse("12-06-2013");     // first convert user entered date into a Date object

    String dateString1 = sdf1.format(today1);	// format() method throws a checked exception, ParseException	

    System.out.println(dateString1);
  }
}