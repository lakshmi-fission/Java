package linkedlistexample;

public class LinkListExamp {
	public void displayElements(Node head){
		if(head == null){
			return;
		}
	    Node current = head;
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}
	public void insertAtBegning(Node head,int data){
		if(head == null){
			head = new Node(data);
		}
		
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	public void insert(Node head,int position,int data){
		if(position == 1){
			new Node(data).next = head;
			head = new Node(data);
		}
			Node previous  = head;
			int count = 1;
			while(count<position-1){
				previous = previous.next;
				count=count+1;
			}
			Node node = new Node(data);
			previous.next = node;
			node.next = previous.next;
			
	}
	public void delete(Node head, int position){
		if(position == 1){
			Node temp = head;
			head = head.next;
			temp.next = null;
		}
		int count=1;
		Node previous = head;
	while(count<position-1){
		previous = previous.next;
		count = count+1;
	}
	Node current = previous.next;
	previous.next = current.next;
	current.next = null;
	}
	public static void main(String args[]){
		Node head =  new Node(10);
		Node sec = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		head.next = sec;
		sec.next = third;
		third.next = fourth;
		fourth.next = null;
		LinkListExamp link = new LinkListExamp();
		link.displayElements(head);
		link.insertAtBegning(head, 15);
		link.displayElements(head);
		
	}
	public Node insertAtEnd(Node head,int data){
		Node node = new Node(data);
		if(head == null){
			return node;
		}
		Node current = head;
		while(null!=current.next){
			current = current.next;
		}
		current.next = node;
		return head;
		  
		
		
	}
private static class Node{
	int data;
	Node next;
	public Node(int data){
		this.data = data;
		this.next = null;	
	}
	
}
}
