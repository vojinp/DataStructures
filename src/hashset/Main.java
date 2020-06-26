package hashset;

public class Main {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        hashSet.add(new Node("1"));
        hashSet.add(new Node("2"));
        hashSet.add(new Node("3"));
        System.out.println(hashSet.contains(new Node("2")));

        System.out.println();
        hashSet.add(new Node("3"));
        System.out.println(hashSet.contains(new Node("3")));

        System.out.println();
        hashSet.print();
    }
}
