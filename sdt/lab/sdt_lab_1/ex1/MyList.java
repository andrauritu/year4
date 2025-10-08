package sdt.lab.sdt_lab_1.ex1;

public interface MyList {
    void add(int value);
    int get(int index);

    static MyList getList(ListType type) {
        switch (type) {
            case Array:
                return new MyArrayList();
            case LinkedList:
                return new MyLinkedList();
            case SyncList:
                return new MySynchronizedList(new MyArrayList());
            default:
                throw new IllegalArgumentException("Unsupported list type: " + type);
        }
    }
}
