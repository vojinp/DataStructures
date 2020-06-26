package LinkedList;

public class LinkedList {
    private Node root;

    public LinkedList() {
    }

    public LinkedList(Node root) {
        this.root = root;
    }

    public void add(Node newNode) {
        newNode.setNext(root);
        root = newNode;
    }

    public void delete(Node node) {
        Node tempNode = root;
        if (tempNode.equals(node)) {
            root = tempNode.getNext();
            return;
        }

        do {
            if (tempNode.getNext().equals(node)) {
                tempNode.setNext(tempNode.getNext().getNext());
                return;
            }
            tempNode = tempNode.getNext();
        }
        while(tempNode.getNext() != null);
    }

    public Node get(Integer index) {
        Node tempNode = root;
        for(int i = 1; i <= index; i++) {
            tempNode = tempNode.getNext();
            if (tempNode == null) {
                return null;
            }
        }
        return tempNode;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void print() {
        if (root == null) {
            System.out.println("List is empty");
        }

        Node tempNode = root;

        do {
            System.out.println(tempNode);
            tempNode = tempNode.getNext();
        }
        while(tempNode != null);
    }
}
