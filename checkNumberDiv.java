
public class checkNumberDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1;i<=100;i++) {
			if(i%4==0 && i%7==0)
			{
				System.out.println("FooBar");
			}else if(i%4==0)
			{
				System.out.println("Foo");
			}else if(i%7==0)
			{
				System.out.println("Bar");
			}else
			{
				System.out.println(i);
			}
		}

	}

}
