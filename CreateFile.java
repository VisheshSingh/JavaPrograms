import java.util.Formatter;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Formatter fm = new Formatter("C:\\Users\\Vishesh Thakur\\Desktop\\blah.txt");
			fm.format("%s %s %s", "Vishesh","is","great \r\n");
			fm.format("%s %s %s", "Vishesh","is","excellent");
			fm.close();
			
		}
		catch(Exception e){
			System.out.println("Error");
		}

	}

}
