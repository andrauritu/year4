package sdt.lab.sdt_lab_1.ex1;

import java.util.Arrays;

public class MyArrayList implements MyList {
    private static final int DEFAULT_CAPACITY = 10;
    private int[] elements;
    private int size;

    public MyArrayList() {
        this.elements = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public void add(int value) {
        ensureCapacity();
        elements[size++] = value;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elements[index];
    }

    private void ensureCapacity() {
        if (size < elements.length) {
            return;
        }
        int newCapacity = (elements.length == 0) ? 1 : elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}
