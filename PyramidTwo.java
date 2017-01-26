import java.util.Scanner;
public class PyramidTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		int rows = sc.nextInt();
		int temp = rows;
		
		for(int row = 1; row<=rows;row++)
		{
			for(int c=1;c<temp;c++)
				System.out.print(" ");
			temp--;
			for(int c=1;c<=(2*row)-1;c++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
