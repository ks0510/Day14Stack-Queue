/*
 * This java program stimulate the queue using linked list.
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
class Node {
	int data;
	Node next;

	/*
	 * To define constructor for data and node
	 */
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
}

/*
 * Class to define queue operation method
 */
class QueueNew {
	Node front, rear;

	/*
	 * Constructor for rear and front of queue
	 */

	public QueueNew() {
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
}

/*
 * This is main class of program
 */
public class Queue {

	/**
	 * This is main method of program and starting point of program
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		QueueNew q = new QueueNew();

		q.toEnqueue(56);
		q.toEnqueue(30);
		q.toEnqueue(70);

		System.out.println("Queue Front : " + ((q.front != null) ? (q.front).data : -1));
	}
}
