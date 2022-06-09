public class Customstack {
    int sizeofArray;
    // int a[] = new int [2];
    private int a[];
    private int tos;

    Customstack(int sizeofArray) {

        a = new int[sizeofArray];
        this.sizeofArray = sizeofArray;
         
        tos = -1;
    }

    public void push(int num) {
        if (tos == sizeofArray) {
            System.out.println("Our Stack is Full");
            // throw new ArrayIndexOutOfBoundsException("Our Stack is Full");
        } else {
            tos = tos + 1;
            a[tos] = num;
        }
    }

    public int pop() {
        if (tos >= 0) {
            return a[tos--];
        } else {
            System.out.println("This is Emptystack");
            // throw new IndexOutOfBoundsException("Our Stack is Full");
        }
        return 0;

    }

    public int peek() {
        return a[tos];
    }

    public int size() {
        return tos + 1;
    }

    public void display() {
        // int i;
        for (int i = 0; i <= tos; i++) {
            System.out.println(a[i]);

        }

    }
    

}
