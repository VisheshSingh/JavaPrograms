import java.io.File;
import java.util.Scanner;


public class readingaFile {

	public static void main(String[] args) {
		
		try{
		File x = new File("C:\\Users\\Vishesh Thakur\\Desktop\\bla.txt");
		Scanner sc = new Scanner(x);
		
		while(sc.hasNext())
		{
			System.out.println(sc.next());
			
		}
		sc.close();
		}
		catch(Exception e){
			System.out.println("error");
		}
	}

}
