public class Queueimplement<T> {
    private Node<T> front;
    private Node<T> rear;

    private int length;

    private static class Node<T> {
        private final T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public void enqueue(T item) {
        if (front == null) {
            rear = new Node<T>(item);
            front = rear;
        } else {
            rear.next = new Node<T>(item);
            rear = rear.next;
        }
        length++;
    }

    public T dequeue() {
        if (front != null) {
            T item = front.data;
            front = front.next;
            length--;
            return item;
        }
        return null;
    }

    public int size() {
        return length;
    }

    public void displayqueue() {
        Node<T> thisnode = front;
        while (thisnode != null) {
            System.out.print(thisnode.data + " ");
            thisnode = thisnode.next;
            // System.out.println();
        }
    }

    public boolean isEmpty() {
        System.out.println();
        return length == 0;
    }

    public T peek(){
        return front.data;

    }
}
