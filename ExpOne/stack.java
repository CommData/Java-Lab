public class stack {
    private int[] arr;
    private int capacity;
    private int top;

    stack(int size) {
         arr = new int[size];
         capacity = size;
         top = -1;
    }

    public void push(int x) {
        if(isFull()) {
            System.out.println("Overflow\nExiting Program\n");
            System.exit(-1);
        }
        System.out.println("Inserting element "+ x);
        arr[++top] = x;
    }
    public int pop() {
        if(isEmpty()) {
            System.out.println("Underflow\nExiting Program\n");
            System.exit(-1);
        }
        System.out.println("Removing the element " + arr[top]);
        return arr[top--];
    }
    public int peek() {
        if(!isEmpty()) {
            return arr[top];
        }else {
            System.out.println("Stack is Empty\n");
            System.exit(-1);
        }
        return -1;
    }
    public int size() {
        return top+1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == capacity - 1;
    }
}