/*
 * Name of the Student: Hongyun Du
 * Class: CS3345
 * Section:003
 * Semester: Fall 2018
 * Project 2
 */
public class myLinkedList<AnyType extends IDedObject> {
	Node<AnyType> initial;

	// default constructor
	myLinkedList() {
		initial = new Node<AnyType>(null, null);
	}

	// clean this list up
	public void makeEmpty() {
		// empties the linked list
		initial.next = null;
	}

	// check whether this list empty or not.
	public boolean isEmpty() {
		if (initial.next == null)
			return true;
		else
			return false;
	}

	AnyType findID(int ID) {
		// Get the generic type to get the particular id and returns AnyType.
		// returns null if the list is empty or ID not found.
		Node<AnyType> temp = initial.next;
		if (temp == null)
			return null;
		while (temp != null) {
			if (temp.data.getID() == ID)
				return temp.data;
			else
				temp = temp.next;
		}
		return null;
	}

	boolean insertAtFront(AnyType x) {
		// insert at front of list
		// return false if that ID already exists
		if (isEmpty() == true) {
			// if this list is empty, add the data to the font.
			Node<AnyType> insert = new Node<AnyType>(x, initial.next);
			initial.next = insert;
			return true;

		} else {
			// if this list isn't empty, check the duplication and then add the data to the
			// front.
			if (findID(x.getID()) != null)
				return false;
			else {
				Node<AnyType> insert = new Node<AnyType>(x, initial.next);
				initial.next = insert;
				return true;
			}
		}
	}

	AnyType deleteFromFront() {
		// delete and return the record at the front of the list
		// return null if the list is empty
		if (initial.next != null) {
			Node<AnyType> temp = initial.next;
			initial.next = temp.next;
			return temp.data;
		} else
			return null;
	}

	AnyType delete(int ID) {
		// find and delete the record with the given ID
		// returns null if it isn¡¯t found
		Node<AnyType> current = initial;
		Node<AnyType> temp;
		while (current.hasNext()) {
			if (current.next.data.getID() == ID) {
				temp = current.next;
				current.next = temp.next;
				return temp.data;
			} else
				current = current.next;
		}
		return null;
	}

	void printAllRecords() {
		// print all records.
		if (initial.next == null) {
			// if it's empty, print alert message and terminate this function.
			System.out.println("\t\tThis list contain nothing.");
			return;
		}

		Node<AnyType> temp = initial.next;
		while (temp != null) {
			temp.data.printID();
			temp = temp.next;
		}

	}

	private static class Node<AnyType> {
		// node data type
		public AnyType data;
		public Node<AnyType> next;

		Node(AnyType a, Node<AnyType> n) {
			data = a;
			next = n;
		}

		public boolean hasNext() {
			if (next == null)
				return false;
			else
				return true;
		}
	}

}
