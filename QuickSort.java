import java.util.Scanner;
public class QuickSort {
	
	public static void quicksort(int[] arr, int low, int high)
	{
		if(arr==null||arr.length==0)
			return;
		if(low>=high)
			return;
		int middle=low+(high-low)/2;
		int pivot=arr[middle];
		
		int i=low,j=high;
		
		while(i<=j)
		{
			while(arr[i]<pivot)
				i++;
			while(arr[j]>pivot)
				j--;
			if(i<=j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;j--;
			}
		}
		
		if(low<j)
			quicksort(arr,low,j);
		if(high>i)
			quicksort(arr,i,high);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n,i;
		System.out.println("Enter the no of elements: ");
		n = sc.nextInt();
		System.out.println("Enter"+ n + "elements: ");
		int arr[] = new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("elements before sorting: ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		int low=0;
		int high=arr.length-1;
		
		quicksort(arr,low,high);
		
		System.out.println("Elements after sorting:");
		for(int x:arr)
		{
			System.out.println(x+" ");
		}
	}

}
