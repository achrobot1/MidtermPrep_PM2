package Queue;

public class Queue {
	
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
	private Node head, tail;
	
	public Queue()
	{
		head = null;
		tail = null;
	}
	
	public void enqueue(int data)
	{
		if(head == null)
		{
			head = new Node(data, null);
			tail = head;
		}
		else
		{
			tail.next = new Node(data, null);
			tail = tail.next;
		}
	}
	
	public int dequeue()
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
	
	public void printQueue()
	{
		Node cursor = head;
		while(cursor != null)
		{
			System.out.printf("%d, ", cursor.data);
			cursor = cursor.next;
		}
	}
}
