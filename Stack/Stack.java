package Stack;


public class Stack {
	
	public class Node
	{
		int data;
		Node next;
		public Node(int data, Node next)
		{
			this.data = data;
			this.next = next;
		}
	}
	
	// fields
	Node head;
	
	public Stack()
	{
		
	}
	
	public void push(int data)
	{
		if(head == null)
		{
			head = new Node(data, null);
		}
		else
		{
			head = new Node(data, head);
		}
	}
	
	public int pop()
	{
		int returnVal;
		if(head == null)
		{
			returnVal = 0;
		}
		else
		{
			returnVal = head.data;
			head = head.next;
			
		}
		return returnVal;
	}
	
	public void printStack()
	{
		Node cursor = head;
		while(cursor != null)
		{
			System.out.printf("%d, ", cursor.data);
			cursor = cursor.next;
		}
	}

}
