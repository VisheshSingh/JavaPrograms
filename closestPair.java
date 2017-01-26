
public class closestPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,-1,-2,-3,-4};
		closePair(arr, 20);
	}
	
	public static void closePair(int[] arr, int x)
	{
		int minDiff = Math.abs(arr[0]+arr[1]-x);
		int firstIndex=0,lastIndex=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int tempDiff = Math.abs(arr[i]+arr[j]-x);
				if(tempDiff<minDiff)
				{
					firstIndex=i;
					lastIndex=j;
					minDiff=tempDiff;
				}
			}
		}
		System.out.println(arr[firstIndex]+" "+arr[lastIndex]);
	}

}
