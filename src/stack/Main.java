package stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(new Node("1"));
        stack.push(new Node("2"));
        stack.push(new Node("3"));
        stack.print();

        System.out.println();
        stack.pop();
        stack.pop();
        stack.print();
    }
}
