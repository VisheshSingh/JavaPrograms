import java.util.Scanner;

interface a {
	int add(int a, int b);

}

interface b extends a{
	int mul(int a, int b);

}
public class ImplementInterface implements b{
	
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	
	public int div(int a, int b){
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementInterface in = new ImplementInterface();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("Added result: " + in.add(x, y) );
		System.out.println("multiplied result: " + in.mul(x, y) );
		System.out.println("divided result: " + in.div(x, y) );
		

	}
}
