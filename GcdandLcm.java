import java.util.Scanner;
public class GcdandLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers: ");
		Scanner sc= new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println("Gcd of "+ n1 +" and "+ n2+ ":"+gcd(n1,n2));
		System.out.println("LCM of "+ n1 +" and "+ n2+ ":"+lcm(n1,n2));

	}
	
	public static int gcd(int a,int b)
	{
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}
	
	public static int lcm(int a, int b)
	{
		return a*b/gcd(a,b);
	}

}
