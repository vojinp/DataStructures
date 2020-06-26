package queue;

public class Queue {
    private Node head;
    private Node tail;

    public Queue() {
    }

    public void enqueue(Node newNode) {
        if (tail != null) {
            tail.setNext(newNode);
        }
        tail = newNode;

        if(head == null) {
            head = newNode;
        }
    }

    public Node dequeue() {
        Node tempNode = head;
        head = head.getNext();

        if (head == null) {
            tail = null;
        }

        return tempNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node tempNode = head;

        do {
            System.out.println(tempNode);
            tempNode = tempNode.getNext();
        } while(tempNode != null);
    }
}
