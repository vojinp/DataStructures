package ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(5);
        list.print();

        System.out.println();
        list.add("1");
        list.print();

        System.out.println();
        list.add("2");
        list.add("3");
        list.print();

        System.out.println();
        System.out.println(list.get(1));

        System.out.println();
        list.delete(0);
        list.print();

        System.out.println();
        list.delete(1);
        list.print();

        System.out.println();
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.print();
    }
}
