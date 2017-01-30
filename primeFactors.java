import java.util.List;
import java.util.ArrayList;

public class primeFactors {

	public static List<Integer> primeFactors(int n)
	{
		List<Integer> primeFactors = new ArrayList<Integer>();
		for(int i=2;i<=n;i++)
		{	while(n%i==0)
			{
				primeFactors.add(i);
				n=n/i;
			}
		}
		return primeFactors;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Primefactors of 15 are: " +primeFactors(15));
		
		
		System.out.println("Primefactors of 48 are: " );
		System.out.printf("%s %n",primeFactors(48));
	}

}
