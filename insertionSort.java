
public class insertionSort {
	public static void insertSort(int[] arr)
	{
		for(int i=1; i<arr.length-1;i++)
		{
			int element = arr[i];
			int j=i;
			while(j>0 && arr[j-1]> element)
			{
				arr[j] = arr[j-1];
				j=j-1;
			}
			arr[j]=element;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,2,6,13,45,1,23,96,10};
		System.out.println("before sorting: ");
		
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		insertSort(arr);
		
		System.out.println("After sorting: ");
		
		for(int i: arr)
		{
			System.out.print(i+" ");
		}
	}

}
