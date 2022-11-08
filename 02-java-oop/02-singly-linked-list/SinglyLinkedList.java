public class SinglyLinkedList {
// Member Variable
    public Node head;
// Constructor
    public SinglyLinkedList() {
        this.head=null;
    }
// Member Methods
public void remove() {
    // Check to see if incoming Node has a Head Node
    if (this.head == null) {
        return;
    }
    // Have a variable hold the Node I want to remove
        Node nodeToRemove = this.head;
        this.head = nodeToRemove.next;

    }

}