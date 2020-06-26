package priorityqueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.insert(new Node("a", 1));
        priorityQueue.insert(new Node("b", 2));
        priorityQueue.insert(new Node("c", 0));
        priorityQueue.insert(new Node("d", 5));

        System.out.println(priorityQueue.getHighestPriority());
    }
}
