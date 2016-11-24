
public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {12,12,45,75,25};
		int sum = 0;
		
		for (int i=0; i<array.length; i++)
		{
			sum+=array[i];
			
		}
		System.out.println("The sum of elements in this array is: "+ sum);
	}

}
