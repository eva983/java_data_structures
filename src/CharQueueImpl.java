import java.io.PrintStream;
import java.util.NoSuchElementException;
public class CharQueueImpl implements CharQueue{

public class Node{
	 Node next;
	 char item;

	
	
}

public Node head;
private Node tail;
private int size;



public CharQueueImpl(){
	head=null;
	tail=null;
	size=0;
	
}
	
	
public boolean isEmpty(){
	return (head==null);
		
}

public void put(char item){

		Node node = new Node();
		node.item=item;
		if(isEmpty()){
			head=tail=node;
		}
		else {
		tail.next = node;
		tail=node;
		}
		size++;
}

public char get() throws NoSuchElementException{
	if(isEmpty()) {
		throw new NoSuchElementException();
	}
	Node removed = head;
	head=head.next;
	size--;
	return removed.item;
	
	
	
	
	
}

public char peek() throws NoSuchElementException{
	if(isEmpty()){
		throw new NoSuchElementException ();
	}
	
	return head.item;
	
	
	
	}
	
	public void printQueue(PrintStream stream){
		
		if ( isEmpty() )
		{
			stream.println( "Empty deque" );
			return;
		} // end if
		
		Node current=head;
		while (current!=null) {
			stream.println(current.item);
			current=current.next;
		}
		
	}
	
		public int size(){
			return size;
		}
	
}

	
	





