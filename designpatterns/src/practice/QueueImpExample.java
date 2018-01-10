package practice;

public class QueueImpExample {
	//if we implement queues by using arrays then we come across with problem of memory waste i.e we can't utilize front end place once we remove element there.TO over come this problem they come up with circular array 
	static int front = -1;
	static int rear = -1;
	static int[] array = new int[10];
	public static void main(String args[]){
		if(isEmpty()){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		enQueue(8);
		enQueue(10);
		enQueue(17);	
		deQueue();
	}
	public static boolean isEmpty(){
		if(rear == -1 && front == -1){
			return true;
		}
		else{
			return false;
		}
	}
	public static void enQueue(int num){
		
		if(rear==array.length-1){
			System.out.println("Queue is full");
			return;
		}
		else if(isEmpty()){
			front=rear=0;
		}
		else{
			rear=rear+1;
		}
		array[rear]=num;
		
		/*else {
			 if(isEmpty()){
					front=rear=0;
				}
			 else{
					rear = rear+1;
				}
				array[rear]=num;
		}*/
		
	}
	public static void deQueue(){
		if(isEmpty()){
			System.out.println("queue is empty");
		}
		else if (rear==front){
			rear=front=-1;
		}
		else
		{
		System.out.println("deleted element==="+array[front]);
		front = front+1;
		}	
	}
	
}
