/*
 * This java program stimulate queue using linked list and enque an deque element
 */
package queue;

/**
 * 
 * @author Kaif
 *
 */

/*
 * Node class for node and data
 */

class Node2 {
	int data;
	Node next;

	/*
	 * To define constructor for data and node
	 */

	public Node2(int data) {
		super();
		this.data = data;
		this.next = null;
	}
}

/*
 * Class to define queue operation method
 */
class QueueNew2 {
	Node front, rear;

	/*
	 * Constructor for rear and front of queue
	 */
	public QueueNew2() {
		super();
		this.front = null;
		this.rear = null;
	}

	/*
	 * To insert data in queue
	 */
	void toEnqueue(int data) {

		Node temp = new Node(data);

		/*
		 * To check queue is empty or not
		 */
		if (rear == null) {
			front = rear = temp;
			return;
		}
		rear.next = temp;
		rear = temp;
	}

	void toDequeue() {
		if (front == null)
			return;

		Node temp = front;
		front = front.next;

		if (front == null)
			rear = null;
	}
}

/*
 * This is main class of program
 */
public class Queue2 {

	/**
	 * This is main method of program and starting point of program
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		/*
		 * To create object of queue
		 */
		QueueNew2 q = new QueueNew2();

		q.toEnqueue(56);
		q.toEnqueue(30);
		q.toEnqueue(70);

		System.out.println("Queue Front : " + ((q.front != null) ? (q.front).data : -1));

		q.toDequeue();
		q.toDequeue();
		q.toDequeue();

		System.out.println("Queue Rear : " + ((q.rear != null) ? (q.rear).data : -1));
	}
}
