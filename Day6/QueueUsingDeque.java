// Easy: https://www.geeksforgeeks.org/implement-stack-queue-using-deque/


// implementation using Doubly linked list is yet to be practiced. 


import java.util.ArrayDeque;
import java.util.Deque;

// IMPLEMENTING QUEUE USING DEQUE
public class QueueDequeue {
    Deque<Integer> q1 ;
//    Deque<Integer> q2;

    QueueDequeue() {
        q1 = new ArrayDeque<>();
//        q2 = new ArrayDeque<>();
    }

    public void insert(int item) {
        q1.addLast(item);
    }

    public int remove() {
        return q1.removeFirst();
    }

    public int peek() {
        return q1.peekFirst();
    }

    public void display() {
        for (int item: q1) {
            System.out.print(item + "<-");
        }
        System.out.print("END");
    }

    public static void main(String[] args) {
        QueueDequeue q1 = new QueueDequeue();
        q1.insert(20);
        q1.insert(30);
        q1.insert(40);
        System.out.println(q1.peek());
        System.out.println("deleted element from the queue: " + q1.remove());
        q1.insert(100);
        q1.insert(200);
        q1.display();
    }
}



