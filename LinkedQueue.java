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
public class LinkedQueue {
    private Customer first, last;

    public LinkedQueue() {
	first = last = null;
    }

    // Checks to see if anyone needs service
    public boolean isEmpty() {
	return first == null;
    }
    // Method to get the new customer in line
    public void enqueue(Customer c) {
        if (isEmpty()) {
            first = last = c;
	} else {
            last.setNext(c);
            last = c;
        }
    }
    // Method to service a new customer from the top of the
    // queue so the cutomer had been serviced 
    public Customer dequeue() {
        if (isEmpty()) {
            System.out.println("The list is currently empty. There's nothing to be removed");
		return null;
	}

	Customer temp = first;

	first = first.getNext();

	if (first == null) {
            last = null;
	}
	return temp;
    }

    public void examineLine() {
	Customer c = first;

	while (c != null) {
            System.out.println(c);

            c = c.getNext();
	}
    }

    public Customer getFirst() {
	return first;
    }
}
