package hashmap;

public class Node {
    private String node;
    private Integer key;
    private Node next;

    public Node(String node, Integer key) {
        this.node = node;
        this.key = key;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "node='" + node + '\'' +
                '}';
    }
}
