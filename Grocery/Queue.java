package grocery;

/**
 * Queue for Grocery Store
 * Grocery Store Line Program
 * ITSC 2214-001
 * @author Matthew Pachapa
 */
public class Queue {
   private Customer first, last;
   private int size;
   
   //General constructor setting everything to null
   public Queue () {     
      first = last = null;
      size = 0;
   }
   
   public void add ( Customer c ) {
      //adds Customer c to the back of the queue
      
      //when the list is empty, set first to c
      if (first == null) {
         first = c;
      } else { //list is not empty
         last.setNext (c);
      }
      size++;
      //always set last to the object we're adding
      last = c;
   }

   //Remove method to remove the customer from the queue
   public Customer remove () {
   
      //create temporary ref to first to return at the end
      Customer c = first;
   
      //is the list empty
      if (first == null) {
         System.out.println ("The line is already empty");
         return null;
      }
      
      //update first to point to the next (2nd) object in the list
      first = first.getNext ();
      
      //if the list is now empty, also set last = null
      if (first == null) {
         last = null;
         size = 0;
      } else
         size--;
      
      return c;
   
   }

   //Service method to decrease the service time of the customer
   public int service(){
       //Checks to see if line is empty
       if(first == null){
           return -1;
       }
       //decreases service Time
       first.decServiceTime();

       return first.getServiceTime();
   
   }

   //returns the size of the queue
   public int getSize(){
      return size;
   }
}
