package hashset;

import java.util.Objects;

public class Node {
    private String node;
    private Node next;

    public Node(String node) {
        this.node = node;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node1 = (Node) o;
        return Objects.equals(node, node1.node);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node);
    }
}
