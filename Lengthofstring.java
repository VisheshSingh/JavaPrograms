
public class Lengthofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "vishesh";
		System.out.println("The length is: "+ len(s));
	}
	
	public static int len(String s)
	{
		int length=0;
		char[] ch = s.toCharArray();
		System.out.println(ch);
		
		for(char c: ch)
		{
			length++;
		}
		return length;
	}

}
