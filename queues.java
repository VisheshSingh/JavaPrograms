public class queues{
	public static final int capacity = 5;
	int[] arr = new int [capacity];
	int top = -1;
	int rear=0;
	int size=0;
	
	public void enqueue(int element){
		if(top < capacity -1)
		{
			top++;
			arr[top] =  element;
			System.out.println("Element " + element + " Pushed to queue");
			display();
		}else
		{
			System.out.println("queue Overflow");
		}
	}
	
	public void dequeue(){
		if(top >= rear)
		{
			rear++;
			System.out.println("Element popped out");
			display();
		}else
		{
			System.out.println("queue underflow");
		}
	}
			
	public void display(){
		if(top >= 0)
		{
			System.out.println("queue:");
			for(int i=rear;i<=top;i++) 
			{
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[] args){
	queues q = new queues();
	q.dequeue();
	q.enqueue(5);
	q.enqueue(15);
	q.enqueue(25);
	q.enqueue(35);
	q.enqueue(45);
	q.dequeue();
	q.dequeue();
	q.dequeue();
	q.dequeue();
	q.dequeue();
	}
}