// Easy: https://www.geeksforgeeks.org/implement-stack-queue-using-deque/

// implementation using Doubly linked list is yet to be practiced. 

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;


// IMPLEMENTING STACK USING DEQUE
public class StackDeque {
    Deque<Integer> stack;

    StackDeque() {
        stack = new ArrayDeque<>();
    }

    public void push(int item) {
        stack.addLast(item);
    }

    public int pop() {
        return stack.removeLast();
    }

    public int peek() throws Exception{
        return stack.peekLast();
    }

    // display is not working well ----------------------
    public void display() {
        for (int item: stack) {
            System.out.print(stack.peekLast() + " -> ");
        }
        System.out.print("TOP");
    }

    public static void main(String[] args) {
        StackDeque stackDeque = new StackDeque();
        stackDeque.push(40);
        stackDeque.push(50);
        stackDeque.push(60);
        stackDeque.push(70);
        stackDeque.push(80);
        stackDeque.display();

        System.out.println(stackDeque.pop());
        stackDeque.display();
    }
}
