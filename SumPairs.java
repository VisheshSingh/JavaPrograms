
public class SumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2,15,7,2,9,6,5,-3,8};
		pairs(arr,15);

	}
	
	public static void pairs(int[] arr, int x)
	{
		int temp,i,j;
		for( i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				temp = arr[i]+arr[j];
				if(temp == x)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
			}
			
		}
		

}
