
public class JeffList<T> {
	Node<T> head;
	Node<T> current;
	Node<T> previous;
	Node<T> next;
	//Node tail;
	
	
	public JeffList()
	{
		
	}
	
	public void addFirst(T elem, int ID)
	{
		Node<T> temp = new Node<T>(ID, elem);
		
		temp.next = head;
		head = temp;
	}
	
	public void addAtEnd(T elem, int ID)
	{
		Node<T> temp = new Node<T>(ID, elem);
		if(head == null)
		{
			head = temp;
		}
		else
		{
			current = head;
		
			while(current != null)
			{
				previous = current;
				current = current.next;
			}
			previous.next = temp;
		}
	}
	
	public T removeFromEnd()
	{
		if(head == null)
			return null;
		else	
		{
			current = head;
			
			while(current.next.next != null)
			{
				current = current.next;
			}
			Node<T> temp = current.next;
			current.next = null;
			
			return temp.item;
			
		
			
		}
	}
	
	public T removeFromFront()
	{
		if (head == null)
			return null;
		else
		{
			current = head;
			head = current.next;
			
			return current.item;
		}
	}
	
	public void displayList()
	{
		System.out.println("List (F to L): ");
		Node<T> current = head;
		
		while(current != null)
		{
			current.displayNode();
			current = current.next;
		}
		System.out.println("");
	}
	
	
	
	
}
