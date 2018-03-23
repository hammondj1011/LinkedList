
public class Node<T>{
	
	Node next;
	T item;
	int ID;
	
	public Node(int identifier, T elem)
	{
		ID = identifier;
		item = elem;
	}
	
	public void displayNode()
	{
		System.out.println("{ID is: " + ID + ", Elem is " + item);
	}
	
	
	

}
