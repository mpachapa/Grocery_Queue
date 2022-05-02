# Grocery_Queue
This is a java application that was created for a class while I was attending the University of North Carolina at Charlotte. This class was taught by Daniel Jugan, this is a [link](https://webpages.charlotte.edu/djugan/) to his webpage. Progessor Jugan provided the Customer class and required for us to create the Grocery store program as well as the associated queue for the class.
---
## I used IntelliJ IDEA for this application.
### Grocery.java
This is where the main method for this application is located. It has the queue length, how many customers were serviced, the max length of the queue, as well as a timer. It also has a Queue object that is looped through the program 60 times (one hour) with a 25% chance of creating a new customer.
### Customer.java
This was a provided class that creates a random service time between 1 and 5 minutes. It also has getNext and setNext Customer methods, as well as getServiceTime and decServiceTime methods. These allow for me to get their current service time and decrease it by calling it in the Queue object, also allowing for me to get and set the next customer in the line.
### Queue.java
