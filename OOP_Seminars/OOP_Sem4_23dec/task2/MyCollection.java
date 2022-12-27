package OOP_Seminars.OOP_Sem4_23dec.task2;

import java.util.Arrays;

class MyCollection<Element> {

    private Element[] array;
    private int size = 0;

    public MyCollection() {
        array = (Element[]) new Object[10];
    }

    public void add(Element element) {
        if (size < array.length) {
            array[size] = element;
            size++;
            return;
        }
        else {
            array = Arrays.copyOf(array, array.length * 2);
        }
        
    }

    public Element get(int index) {
        return array[index];
    }

    public void set(Element element, int index) {
        array[index] = element;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(array[i] + " ");
        }
        return sb.toString();
    }

}