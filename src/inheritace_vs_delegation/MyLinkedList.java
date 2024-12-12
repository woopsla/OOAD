package inheritance_vs_delegation;

import java.util.LinkedList;

public class MyLinkedList<T> {

    private LinkedList<T> list = new LinkedList<>();

    public void addFirst(T e) {
        list.addFirst(e);
    }

    public T removeFirst() {
        return list.removeFirst();
    }

    public T getFirst() {
        return list.getFirst();
    }

    public void add(int index, T e) {
        list.add(index, e);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }

    // ...
}
