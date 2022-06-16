# Grocery_Queue
This is a java application that was created for a class while I was attending the University of North Carolina at Charlotte. This class was taught by Daniel Jugan, this is a [link](https://webpages.charlotte.edu/djugan/) to his webpage. ProFessor Jugan provided the Customer class and required for us to create the Grocery store program as well as the associated queue for the class.
___
## I used IntelliJ IDEA for this application.
### Grocery.java
This is where the main method for this application is located. It has the how many customers were serviced, the max length of the queue, as well as a timer that is incrimented if the queue isn't empty. It also has a Queue object that is looped through the program 60 times (one hour) with a 25% chance of creating a new customer.
### Customer.java
This was a provided class that creates a random service time between 1 and 5 minutes. It also has getNext and setNext Customer methods, as well as getServiceTime and decServiceTime methods. These allow for me to get their current service time and decrease it by calling it in the Queue object, also allowing for me to get and set the next customer in the line.
### Queue.java
This has three main values, the first customer, the last customer, and the size of the queue.  There is also an add method that takes a customer object and adds it to the queue and updates the length of the queue. There is a corresponding method that returns the size of the queue, as well as a method that removes the customer once their service time has decreased to zero.
