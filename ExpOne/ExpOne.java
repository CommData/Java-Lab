
public class ExpOne {
    public static void main(String[] args) {

        //-----------------------Stack Implementation------------------------------------//
        stack s1 = new stack(3);
        s1.push(1);      
        s1.push(2);      
        s1.pop();        
        s1.pop(); 
        s1.push(3);     
 
        System.out.println("The top element is " + s1.peek());
        System.out.println("The stack size is " + s1.size());
        //-----------------------Stack Implementation------------------------------------//
        

        //-----------------------Queue Implementation------------------------------------//
        queue q = new queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("The front element is " + q.qfront());
        q.dequeue();
        System.out.println("The rear element is " + q.qback());
        System.out.println("The queue size is " + q.size());
        q.dequeue();
        q.dequeue();
        //-----------------------Queue Implementation------------------------------------//
    }
}