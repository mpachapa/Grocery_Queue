package Grocery;

/**
 * Grocery Store Line Program
 * ITSC 2214-001
 * @author Matthew Pachapa
 */
public class Grocery {

    public void function(){
        System.out.println("other");
    }

    public static void main(String[] args) {
        //creation of variables
        int serviceTime = 60;
        int customerServiced = 0;
        int max = 0;
        Queue line = new Queue();
        //For loop to run for at least 60 times
        for (int i = 1; i <= serviceTime; i++){
            System.out.println("Minute: " + i);
            //25% chance to add new customer to line
            if((int)(Math.random()*4) == 1){
                line.add(new Customer());
                System.out.println("New customer added!  Queue length is now " + line.getSize());
            }
            //Checks to see if the line is empty when service time is greater than 60
            if (serviceTime >= 60 && line.getSize() == 0){
                serviceTime = 60;
            } else if (line.getSize() != 0){
                serviceTime++;
            }
            //keep track of max line length
            if(line.getSize() > max){
                max = line.getSize();
            }
            //service of customer
            int isServiced = line.service();
            
            //removes customer is service time 0
            if(isServiced == 0){
                line.remove();
                customerServiced++;
                System.out.println("Customer serviced and removed from the queue.  Queue length is now " + line.getSize());
            }
            //requirement
            System.out.println("---------------------------------------------------");

        }
        //prints out num of Customers Serviced and max line length during 60 min
        System.out.println("The total number of customers serviced is " + customerServiced);
        System.out.println("The maximum line length was " + max);
    }
    
}
