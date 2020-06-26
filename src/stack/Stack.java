package stack;

public class Stack {
    private Node head;

    public void push(Node newNode) {
        if (head != null) {
            newNode.setNext(head);
        }
        head = newNode;
    }

    public Node pop() {
        if (head == null) {
            return null;
        }

        Node tempNode = head;
        head = head.getNext();

        return tempNode;
    }

    public void print() {
        Node tempNode = head;
        do {
            System.out.println(tempNode);
            tempNode = tempNode.getNext();
        } while (tempNode != null);
    }
}
