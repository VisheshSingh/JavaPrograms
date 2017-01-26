
public class BubbleSort {
	
	static void bubSort(int array[])
	{
		int temp = 0;
		int n=array.length;
		
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(array[j-1] > array[j])
				{
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,60,45,24,7,17,1,40};
		System.out.println("Array before sorting: ");
		for (int i = 0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		bubSort(arr);
		
		System.out.println("Array after sorting: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
