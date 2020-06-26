package priorityqueue;

public class ArrayList {
    static Integer INITIAL_SIZE = 5;
    private Node[] values;
    private Integer size;

    public ArrayList() {
        this.values = new Node[INITIAL_SIZE];
        this.size = 0;
    }

    public Node[] getValues() {
        return values;
    }

    public void add(Node newValue) {
        if (size.equals(values.length)) {
            Node[] newValues = new Node[size * 2];
            for (int i = 0; i < size; i++) {
                newValues[i] = values[i];
            }
            values = newValues;
        }
        values[size] = newValue;
        size++;
    }

    public Node get(Integer index) {
        return values[index];
    }

    public void delete(Integer index) {
        if (index >= size) {
            return;
        }
        for(int i = index; i < size - 1; i++) {
            values[i] = values[i + 1];
        }
        values[size - 1] = null;
        size--;
    }

    public void print() {
        for (Node value: values) {
            if (value == null) {
                return;
            }
            System.out.println(value);
        }
    }
}