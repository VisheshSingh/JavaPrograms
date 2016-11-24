
public class multiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstArr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int secondArr[][] = {{1,2,3,4},{4,5},{7,8,9}};
		
		System.out.println("First Array:");
		display(firstArr);
		System.out.println("Second Array:");
		display(secondArr);
	}
	
	public static void display(int x[][])
	{
		for(int row=0; row<x.length;row++)
		{
			for(int colum=0;colum<x[row].length;colum++)
			{
				System.out.print(x[row][colum]+"\t");
			}
			System.out.println();
		}
	}
}
