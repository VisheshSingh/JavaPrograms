
public class ByReference {
	int x = 500;
	
	void modify(ByReference a)
	{
		a.x = 2500;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByReference b1 = new ByReference();
		
		System.out.println("Before passing reference: " + b1.x);
		
		b1.modify(b1);
		
		System.out.println("After passing reference: " + b1.x);

	}

}
