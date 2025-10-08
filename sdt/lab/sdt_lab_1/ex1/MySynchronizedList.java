package sdt.lab.sdt_lab_1.ex1;

public class MySynchronizedList implements MyList {
    private final MyList list;

    public MySynchronizedList(MyList list) {
        this.list = list;
    }

    @Override
    public synchronized void add(int value) {
        list.add(value);
    }

    @Override
    public synchronized int get(int index) {
        return list.get(index);
    }
}
