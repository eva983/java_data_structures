public class CharQueueWithMinImpl extends CharQueueImpl implements CharQueueWithMin {
	
	public CharQueueWithMinImpl(){
	super();
	}
	
	

	
	CharDoubleEndedQueueImpl D = new CharDoubleEndedQueueImpl();
	

	public char min(){
		return D.getLast();
	}
	
	public void put(char item) {
		super.put(item);
		
		if(D.isEmpty()) {
			D.addFirst(item);
		}
		else {
			if(item < D.getLast()){
				D.removeLast();
				D.addFirst(item);
			}
			
		}
		
		
	}
	
	public char get(){
		char temp=super.get();
		
		if(D.getLast()==temp) {
			D.removeLast();
			
			Node move=super.head;
			D.addFirst(move.item);
			while(move!=null){
				if(move.item<D.getLast()){
				 D.removeLast();
				 D.addFirst(move.item);
				}
				move=move.next;
			}
		}
		
		return temp;
	}
	
}
					
			
		
		
		
		
		

	
	
	