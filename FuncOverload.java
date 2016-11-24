import java.util.Scanner;
public class FuncOverload {
	int add(int a , int b)
	{
		return a + b;
	}
	
	double add(double a , double b)
	{
		return a + b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int x = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int y = sc.nextInt();
		
		FuncOverload obj = new FuncOverload();
		int result = obj.add(x, y);
		
		System.out.println("Result: " + result);
		
		System.out.println("Enter 1st number: ");
		double q = sc.nextDouble();
		System.out.println("Enter 2nd number: ");
		double w = sc.nextDouble();
		
		double r = obj.add(q, w);
		
		System.out.println("Result: " + r);
		
		
	}

}
