import java.util.Scanner;
public class squared {
	int square(int x)
	{
		return x*x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		
		squared num = new squared();
		int result = num.square(a);
		
		System.out.println("Result = " + result);
		
		
		

	}

}
