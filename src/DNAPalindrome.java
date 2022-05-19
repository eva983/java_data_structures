import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class DNAPalindrome {
	
	public static void main(String args[]){
		
		PrintStream stream=new PrintStream(System.out);
        Scanner sc=new Scanner(System.in);
   
        CharDoubleEndedQueueImpl	deque=new CharDoubleEndedQueueImpl();
   
        String seq;
   
   System.out.println("Type a DNA sequence\n");
   // gets input //
   seq=sc.nextLine();
   boolean valid=true; 
   for(int i=0;i<seq.length();i++){
		if (seq.charAt(i)=='A' || seq.charAt(i)=='T' || seq.charAt(i)=='G' || seq.charAt(i)=='C'){
			
		}
		else {
			valid=false;
			break;
	    }
   }  //checking if input was valid 
   
   if (valid==true){   //if input was valid 
      System.out.println("The sequence was valid!Now checking to see if it is a Watson-Crick complemented palindrome..\n");
      String subl="";   
	  for(int i=0;i<seq.length();i++){
		  switch (seq.charAt(i)){
		    case 'A': deque.addLast('T');
			          
			          break;
					  
			case 'T': deque.addLast('A');
			          
			           break;
			
			case 'C': deque.addLast('G');
			          
			          break;
            
			 case 'G': deque.addLast('C');
			           break;
		  }
	  } // adding the complementary sequence to our deque 
	   
	   	   

	  // antistrefoume to sublirwmatiko sequence
	   String compl="";
	   
	   
	   for(int i=0;i<seq.length();i++) {
		   compl=compl+deque.removeLast();
	   } // kathe fora epistrefei to last letter tou sublirwmatos 
	  
	   if(seq.equals(compl)){
	        System.out.println("it is a Watson-Crick complemented palindrome!");
	   }
	   else { System.out.println("it's not Watson-Crick complemented palindrome");
	   }
		   
   } // end of ifValid
 else {
		System.out.println( "input was not valid, sorry" );
		
	} 
}
	
	 
}
		 
		 
		 
		  
		
		
	
	


		
		
		
		   
		   