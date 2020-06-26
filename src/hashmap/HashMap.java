package hashmap;

import java.util.Arrays;

public class HashMap {
    static Integer INITIAL_SIZE = 5;
    private LinkedList[] values;

    public HashMap() {
        this.values = new LinkedList[INITIAL_SIZE];
        Arrays.fill(this.values, new LinkedList());
    }

    public void put(Integer key, String value) {
        int keyHash = key.hashCode();
        LinkedList list = values[keyHash % 5];

        Node tempNode = list.getRoot();

        if (tempNode == null) {
            values[key.hashCode() % 5].add(new Node(value, key));
            return;
        }

        if (tempNode.getKey().hashCode() == keyHash && tempNode.getKey().equals(key)) {
            list.setRoot(new Node(value, key));
        }

        while(tempNode.getNext() != null){
            if (tempNode.getNext().getKey().hashCode() == keyHash && tempNode.getKey().equals(key)) {
                tempNode.setNext(new Node(value, key));
            }
            tempNode = tempNode.getNext();
        }

        values[key.hashCode() % 5].add(new Node(value, key));
    }

    public Node get(Integer key) {
        int keyHash = key.hashCode();
        LinkedList list = values[keyHash % 5];

        Node tempNode = list.getRoot();

        do {
            if (tempNode.getKey().hashCode() == keyHash && tempNode.getKey().equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        } while(tempNode != null);

        return null;
    }
}
