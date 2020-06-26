package ArrayList;


public class ArrayList {
    static Integer INITIAL_SIZE = 5;
    private String[] values;
    private Integer size;

    public ArrayList() {
        this.values = new String[INITIAL_SIZE];
        this.size = 0;
    }

    public void add(String newValue) {
        if (size.equals(values.length)) {
            String[] newValues = new String[size * 2];
            for (int i = 0; i < size; i++) {
                newValues[i] = values[i];
            }
            values = newValues;
        }
        values[size] = newValue;
        size++;
    }

    public String get(Integer index) {
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
        for (String value: values) {
            if (value == null) {
                return;
            }
            System.out.println(value);
        }
    }
}
