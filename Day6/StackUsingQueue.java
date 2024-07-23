// Easy: https://leetcode.com/problems/implement-stack-using-queues/description/

class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        while(!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        q1.add(x);
        while(!q2.isEmpty()) {
            q1.add(q2.remove());
        }
    }
    
    public int pop() {
        return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

// Removal efficient
// push - O(n), before pushing new element in the q1, transfer all elements of q1 to q2 and then add new element in q1 and again transfer all elements from q2 back to q1

// pop, peek - O(1)


/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */