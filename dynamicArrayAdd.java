import java.util.ArrayList;
import java.util.Scanner;
public class dynamicArrayAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>(5);
		for (int i=0;i<5;i++)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 5 digits: ");
			int a = sc.nextInt();
			arr.add(a);
			
		}
		System.out.println(arr);
		
		int sum=0;
		for(int i=0;i<arr.size();i++)
		{
			sum=sum+arr.get(i);
		}
		System.out.println("sum: "+sum);
	}

}
