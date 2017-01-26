public class stacks{
	public static final int capacity = 5;
	int[] arr = new int [capacity];
	int top = -1;
	
	public void push(int element){
		if(top < capacity -1)
		{
			top++;
			arr[top] =  element;
			System.out.println("Element" + element + "Pushed to stack");
			display();
		}else
		{
			System.out.println("Stack Overflow");
		}
	}
	
	public void pop(){
		if(top >= 0)
		{
			top--;
			System.out.println("Element popped out");
			display();
		}else
		{
			System.out.println("Stack underflow");
		}
	}
			
	public void display(){
		if(top >= 0)
		{
			System.out.println("Stack:");
			for(int i=0;i<=top;i++) 
			{
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[] args){
	stacks st = new stacks();
	st.pop();
	st.push(5);
	st.push(10);
	st.push(15);
	st.push(20);
	st.push(25);
	st.pop();
	st.pop();
	st.pop();
	st.pop();
	st.pop();
	}
}