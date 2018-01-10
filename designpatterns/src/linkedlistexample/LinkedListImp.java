package linkedlistexample;

public class LinkedListImp {
	
  public StuNode head;
  
  public LinkedListImp(){
	head = null;
}
public void add(int position,String data){
	if(head == null)
	{
	StuNode node = new StuNode(position,data);
	node.nextnode = head;
	head = node;
	}
}
}

