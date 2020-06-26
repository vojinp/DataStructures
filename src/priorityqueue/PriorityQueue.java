package priorityqueue;


public class PriorityQueue {
    private ArrayList values;

    public PriorityQueue() {
        values = new ArrayList();
    }

    public void insert(Node node) {
        values.add(node);
    }

    public Node getHighestPriority() {
        if (values.getValues().length == 0) {
            return null;
        }

        Node highestPriorityItem = values.get(0);

        for (Node node: values.getValues()) {
            if (node == null) {
                break;
            }

            if (node.getPriority() < highestPriorityItem.getPriority()) {
                highestPriorityItem = node;
            }
        }

        return highestPriorityItem;
    }
}
