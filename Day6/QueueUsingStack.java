// Easy : https://leetcode.com/problems/implement-queue-using-stacks/description/

class MyQueue {
    Stack<Integer> first;
    Stack<Integer> second;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }
    
    // insertion efficient
    public void push(int x) {
        first.push(x);
    }
    
    public int pop() {
        while(!first.empty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while(!second.empty()) {
            first.push(second.pop());
        }
        return removed;
    }
    
    public int peek() {
        while(!first.empty()) {
            second.push(first.pop());
        }
        int peeked = second.peek();
        while(!second.empty()) {
            first.push(second.pop());
        }
        return peeked;
    }
    
    public boolean empty() {
        return first.isEmpty();
    }
}

/**
 * There are two methods for this:
 * 1. Insertion efficient 
 * -      insert - O(1), remove - O(n)
 * 2. Removal efficient.
 * -      insert - O(n), remove - O(1)

 * 
 */

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */