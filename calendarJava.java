import java.util.Calendar;

public class calendarJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar currentDate = Calendar.getInstance();
		
		System.out.println("Current day is: "+ currentDate.get(Calendar.DATE));
		System.out.println("Current hour is: "+ currentDate.get(Calendar.HOUR));
		System.out.println("Current minute is: "+ currentDate.get(Calendar.MINUTE));
		System.out.println("Current second is: "+ currentDate.get(Calendar.SECOND));
		System.out.println("Current Ms is: "+ currentDate.get(Calendar.MILLISECOND));
		System.out.println("Current year is: "+ currentDate.get(Calendar.YEAR));
		System.out.println("Current day of week is: "+ currentDate.get(Calendar.DAY_OF_WEEK));
		System.out.println("Current day of month is: "+ currentDate.get(Calendar.DAY_OF_MONTH));
		System.out.println("Current day of year is: "+ currentDate.get(Calendar.DAY_OF_YEAR));
	}

}
