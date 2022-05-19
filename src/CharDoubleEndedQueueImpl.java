import java.io.PrintStream;
import java.util.NoSuchElementException;
public class CharDoubleEndedQueueImpl implements CharDoubleEndedQueue  {
	
	private class Node {  
    char item; 
    Node previous;	
	Node next;
  }
	private int size;
	private Node head;
	private Node tail;
	
	public CharDoubleEndedQueueImpl (){
	} //constructor
	
	public boolean isEmpty(){
		return head==null;
	}
	
	public void addFirst(char item){
		Node newHead=new Node();
		newHead.item=item;
		
		if (head!=null){
			newHead.next=head;
			head.previous=newHead;
		}
		
		head=newHead;
		if (tail==null) {
			tail=head;
		}
		
		size++;
		
	}
	
	public char removeFirst() throws NoSuchElementException{
		
		if(isEmpty()) {
			throw new NoSuchElementException();
			
			
		}
		
		
		Node removedH=head;
		head=head.next;
		
		if (head!=null)
			head.previous=null;
		else
			tail=null;
		
		size--;
		return removedH.item;
		
		
	}
	
		public void addLast(char item){
			
				Node newLast=new Node();
				newLast.item=item;
			
				if(isEmpty()){
					head=tail=newLast;
					
				}
				else{
					newLast.previous=tail;
					
					
					tail.next=newLast;
					tail=newLast;
				}
				
				size++;
			}
				
				
			
          public char removeLast() throws NoSuchElementException {
                  if (isEmpty()) {
                      throw new NoSuchElementException() ;
                          
				  }
                  Node removedT=tail; 
				  tail=tail.previous;
				  if(tail==null){
					  head=null;
				  }
				  else {
					 
					  tail.next=null;
				  }
				  size--;
				  return removedT.item;
		  }
				  
				   
		public char getFirst(){
             			
					if (isEmpty()) {
                      throw new NoSuchElementException();
				  }
				  
				  return head.item;
		}
		public char getLast(){
             			
					if (isEmpty()) {
                      throw new NoSuchElementException ();
				  }
				  
				  return tail.item;
		}
		
		public int size(){
			if(isEmpty()){
				
				return 0;
			}
			else {
				return size;
			}
	
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
		}
		
		
		
		
		