
public class Separate0s1s {

	public static int[] separate(int[] arr)
	{
		int left=0;int right=arr.length-1;int temp;
		for(int i=0;i<arr.length;i++)
		{
			while(arr[left]==0)
				left++;
			
			while(arr[right]==1)
				right--;
			
			if(left<right)
			{
				temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 0, 1, 1 ,1,0,0,0,1,0,1,1};
		System.out.println("original array: ");
		for(int i=0; i<arr.length;i++)
		{
			System.out.print( arr[i]+ " ");
		}
		System.out.println();
		arr = separate(arr);
		System.out.println("Splited array: ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}

	}

}
