import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, m=0, flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int a = sc.nextInt();
		
		m= a/2;
		for(i=2;i<=m;i++)
		{
			if(a%i==0)
			{
				System.out.println("Not prime");
				flag=1;
				break;
				
			}
		}
		if(flag==0)
			System.out.println("prime");
	}

}
