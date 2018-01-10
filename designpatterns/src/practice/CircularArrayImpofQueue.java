package practice;

public class CircularArrayImpofQueue {
	//Problem with circular array is once we define arrays we can't change the array's memory,if we want to increase the length of the array then we have to create a big array and we have to shift elements to big array is like burden not good so they come up with linked list implementation of queues
	//copy operation takes O(n) that it's proportional to no of elements
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
		
		if((rear+1)%array.length==front)
		{
			System.out.println("Queue is full");
			return;
		}
		else if(isEmpty()){
			front=rear=0;
		}
		else{
			rear=(rear+1)%array.length;
		}
		array[rear]=num;
		
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
		front = (front+1)%array.length;
		}	
	}
}

