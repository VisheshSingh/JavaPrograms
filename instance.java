
public class instance {
 int sum(int a, int b)
{
	return a + b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		instance obj = new instance();
		System.out.println(obj.sum(100,100));
		System.out.println(obj instanceof instance);
	}

}
