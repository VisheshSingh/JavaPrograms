import java.io.*;
public class consoleInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter a name: ");
		String s1  = br.readLine();
		
		System.out.println("Enter a salary: ");
		String Salary = br.readLine();
		int s2 = Integer.parseInt(Salary);
		
		System.out.println("Enter your rent: ");
		String rent = br.readLine();
		int s3 = Integer.parseInt(rent);
		
		System.out.println("Total salary: "+(s2+s3));
	}

}
