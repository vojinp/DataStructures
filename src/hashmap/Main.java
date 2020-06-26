package hashmap;

public class Main {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        hashMap.put(0, "Value0");
        System.out.println(hashMap.get(0));

        System.out.println();
        hashMap.put(0, "newValue0");
        System.out.println(hashMap.get(0));

        System.out.println();
        hashMap.put(5, "Value5");
        System.out.println(hashMap.get(5));
        System.out.println(hashMap.get(0));
    }
}
