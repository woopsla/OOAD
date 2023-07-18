package stack.work.inheritance;

@SuppressWarnings("serial")
class MyStack<T> extends MyLinkedList<T> {

    public void push(T e) {
        addFirst(e);
    }

    public T pop() {
        return removeFirst();
    }

    public T top() {
        return getFirst();
    }
}

public class Demo {
    public static void main(String... args) {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);

        //region @Should we allow this?
        stack.add(2, 1234);
        System.out.println(stack);
        //endregion
    }
}
