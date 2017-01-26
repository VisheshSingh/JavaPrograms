
public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,6,3,2,5,8,7};
		System.out.println("Missing number is: "+missing(arr));
		int arr2[] = {2,5,4,1,6};
		System.out.println("Missing number is: "+missing(arr2));
		
	}
	
	public static int missing(int[] arr)
	{
		int n = arr.length+1;
		int sum = n*(n+1)/2;
		int resSum=0;
		
		for(int i=0; i<arr.length;i++)
		{
			resSum+= arr[i];
		}
		int missingNumber = sum-resSum;
		return missingNumber;
	}

}
