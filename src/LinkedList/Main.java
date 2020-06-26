package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.setRoot(new Node("1"));
        list.add(new Node("2"));
        list.add(new Node("3"));

        list.print();

        System.out.println();
        System.out.println(list.get(0));
        System.out.println(list.get(2));

        System.out.println();
        list.delete(new Node("2"));
        list.print();

        System.out.println();
        list.add(new Node("4"));
        list.print();

        System.out.println();
        list.delete(new Node("1"));
        list.print();

        System.out.println();
        list.delete(new Node("4"));
        list.print();
    }
}
