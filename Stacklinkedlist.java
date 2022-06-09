public class Stacklinkedlist<T> {
    private int length;

    class Node {
        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;

        }
    }

    Node top;

    Stacklinkedlist() {
        top = null;
    }

    public void push(T val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
        length++;
    }

    public T pop() {
        if (top == null)
            throw new IndexOutOfBoundsException("Stack is empty");
        T tmp = top.data;
        top = top.next;
        length --;
        return tmp;

    }

    public T peek() {
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        Node thisnode = top;
        while (thisnode != null) {
            System.out.println(thisnode.data);
            thisnode = thisnode.next;
        }
    }

    public int size(){
        return length;
    }

}
