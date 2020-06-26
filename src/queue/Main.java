package queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(new Node("1"));
        queue.enqueue(new Node("2"));
        queue.print();

        System.out.println();
        queue.dequeue();
        queue.print();

        System.out.println();
        queue.dequeue();
        queue.print();

        System.out.println();
        queue.enqueue(new Node("1"));
        queue.enqueue(new Node("2"));
        queue.print();
    }
}
