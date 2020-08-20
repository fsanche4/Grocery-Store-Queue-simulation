/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talyshkhanova_2214_project1;

/**
 *
 * @author Irada
 */
import java.util.Random;
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // create new List LinkedQueue object
	LinkedQueue line = new LinkedQueue();

	// Variable for number of customers in line
	int numCust = 0;

	// Variable for the total number of customers serviced
	int NumTotalCust = 0;

	// Variable to hold max line length
	int queueLength = 0;

	// simulate 60 minutes of store activity ( 1 minute = 1 iteration)
	for (int i = 0; i < 60; i++) {
            // probability for (25%)
            int prob = new Random().nextInt(4) + 1;
            // check if a new customer is added
            if (prob <= 25) {
                // if yes a customer is added
		line.enqueue(new Customer());
		numCust++;

		System.out.println("A new customer has been added! The Queue length is now " + numCust);

            }

            if (numCust > queueLength) {
		queueLength = numCust;
            }

            // update the customer already being serviced
            if (!line.isEmpty()) {

                if (line.getFirst().getServiceTime() == 0) {
                    line.dequeue();
                    numCust--;
                    System.out.println("A customer has been serviced and removed from the queue. Queue length is now " + numCust);
                    NumTotalCust++;
                } else if (line.getFirst().getServiceTime() != 0) {

                    line.getFirst().decServiceTime();

		}

            }

            System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - -  - - - - - - - - - - - - - - - - ");

        }

	System.out.println("The total number of customers serviced: " + NumTotalCust);
	System.out.println("The maximum number of people in line at once: " + queueLength);

	}
}
