package sdt.lab.sdt_lab_1.ex1;

public class Main {
    public static void main(String[] args) {
        MyList arrayList = MyList.getList(ListType.Array);
        for (int i = 0; i < 15; i++) { // default capacity is 10 
            arrayList.add(i);
        }
        System.out.println("Array: " + arrayList.get(0) + "," + arrayList.get(5) + "," + arrayList.get(14));

        MyList linkedList = MyList.getList(ListType.LinkedList);
        for (int i = 10; i <= 20; i++) {
            linkedList.add(i);
        }
        System.out.println("Linked: " + linkedList.get(0) + "," + linkedList.get(5) + "," + linkedList.get(10));

        MyList syncList = MyList.getList(ListType.SyncList);
        for (int i = 100; i < 106; i++) {
            syncList.add(i);
        }
        System.out.println("Sync: " + syncList.get(0) + "," + syncList.get(3) + "," + syncList.get(5));
    }
}
