// Easy: https://www.geeksforgeeks.org/problems/implement-two-stacks-in-an-array/1

//{ Driver Code Starts
import java.util.*;

class TwoStack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            twoStacks g = new twoStacks();
            int Q = sc.nextInt();
            while (Q > 0) {
                int stack_no = sc.nextInt();
                int QueryType = sc.nextInt();

                if (QueryType == 1) {
                    int a = sc.nextInt();
                    if (stack_no == 1)
                        g.push1(a);
                    else if (stack_no == 2)
                        g.push2(a);
                } else if (QueryType == 2) {
                    if (stack_no == 1)
                        System.out.print(g.pop1() + " ");
                    else if (stack_no == 2)
                        System.out.print(g.pop2() + " ");
                }

                Q--;
            }
            System.out.println();
            T--;
        }
    }
}

// } Driver Code Ends



class twoStacks {
    int[] stack;
    int top1 = -1;
    int top2 = 101;
    private static final int DEFAULT_SIZE = 101;
    twoStacks() {
        stack = new int[DEFAULT_SIZE];
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        stack[++top1] = x;
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        stack[--top2] = x;
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        if (top1 == -1) {
            return -1;
        }
        return stack[top1--];
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        if (top2 == 101) {
            return -1;
        }
        return stack[top2++];
    }
}

// Review again 

