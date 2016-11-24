
public class check_balance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 1000;
		boolean withdraw;
		
		if(balance > 0)
		{
			withdraw = true;
		}
		else
		{
			withdraw = false;
			
		}
		System.out.println("Can I withdraw : " + withdraw);
	}

}
