public class queue {
    private int[] qarr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    queue(int size) {
        qarr = new int[size];
        front = 0;
        rear = -1;
        capacity = size;
        count = 0;
    }
    public int size() {
        return count;
    }
    public boolean isEmpty() {
        return count == 0;
    }
    public boolean isFull() {
        return count == capacity;
    }
    public void enqueue(int x) {
        if(isFull()) {
            System.out.println("Overflow\nExiting Program\n");
            System.exit(-1);
        }
        System.out.println("Inserting " + x);
        rear = (rear+1)%capacity;
        qarr[rear] = x;
        count++;
    }
    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Underflow\nExiting Program\n");
            System.exit(-1);
        }
        System.out.println("Removing Element " + qarr[front]);
        int x = qarr[front];
        front = (front+1)%capacity;
        count--;
        return x;
    }
    public int qfront() {
        if(!isEmpty()){
            return qarr[front];
        }
        return -1;
    }

    public int qback() {
        if(!isEmpty()){
            return qarr[rear];
        }
        return -1;
    }
}
