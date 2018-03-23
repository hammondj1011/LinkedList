

import java.util.LinkedList;
//comment
public class LinkedListMain {
	
	public static void main(String[] args){
		
		System.out.println("Hello!");
		
		JeffList<String> practice = new JeffList<String>();
		
		practice.addAtEnd("Hello", 1);
		practice.addAtEnd("World", 2);
		practice.addAtEnd("YAY", 3);
		practice.addFirst("FIRST",80);
		
		practice.displayList();
		
		System.out.println("Remove from end: " + practice.removeFromEnd() + "\n");
		
		practice.displayList();
		
		System.out.println("Remove from head: " + practice.removeFromFront() + "\n");
		
		
		practice.displayList();
		
		
	}

}
