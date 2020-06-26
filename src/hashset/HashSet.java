package hashset;

import java.util.Arrays;

public class HashSet {
    static Integer INITIAL_SIZE = 5;
    private LinkedList[] values;

    public HashSet() {
        this.values = new LinkedList[INITIAL_SIZE];
        for (int i = 0; i < values.length; i++) {
            values[i] = new LinkedList();
        }
    }

    public void add(Node node) {
        int hash = node.hashCode();
        LinkedList list = values[hash % 5];

        Node tempNode = list.getRoot();

        if (tempNode == null) {
            list.add(node);
            return;
        }

        do {
            if (tempNode.hashCode() == hash && tempNode.equals(node)) {
                return;
            }
            tempNode = tempNode.getNext();
        } while (tempNode != null);

        list.add(node);
    }

    public Boolean contains(Node node) {
        int hash = node.hashCode();
        LinkedList list = values[hash % 5];

        Node tempNode = list.getRoot();

        if (tempNode == null) {
            return false;
        }

        do {
            if (tempNode.hashCode() == hash && tempNode.equals(node)) {
                return true;
            }
            tempNode = tempNode.getNext();
        } while (tempNode != null);

        return false;
    }

    public void print() {
        for (LinkedList list: values) {
            if (list == null) {
                continue;
            }
            list.print();
            System.out.println("-");
        }
    }
}
