// Easy: https://www.geeksforgeeks.org/problems/multiply-two-linked-lists/1

//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


// } Driver Code Ends
/*Node is defined as
class Node
{
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}*/

class Solution {
    static final long MOD = 1000000007;
    public long multiplyTwoLists(Node first, Node second) {
        long len1 = size(first) - 1;
        long len2 = size(second) - 1;
        
        //traverse first list
        Node temp1 = first;
        long num1 = 0;
        while(temp1 != null) {
            num1 = ((num1 * 10) % MOD + (temp1.data) % MOD) % MOD;
            temp1 = temp1.next;
        }
        
        //traverse second list
        Node temp2 = second;
        long num2 = 0;
        while(temp2 != null) {
            num2 = ((num2 * 10) % MOD + (temp2.data) % MOD) % MOD;
            temp2 = temp2.next;
        }
        
        return (num1 % MOD * num2 % MOD) % MOD;
    }
    
    public long size(Node head) {
        Node temp = head;
        long count = 0;
        while(temp != null) {
            count += 1;
            temp = temp.next;
        }
        return count;
    }
}

//{ Driver Code Starts.

public class GFG {
    public static Node newNode(int data) { return new Node(data); }

    public static void push(Node[] head_ref, int new_data) {
        Node new_Node = newNode(new_data);
        new_Node.next = head_ref[0];
        head_ref[0] = new_Node;
    }

    public static void reverse(Node[] r) {
        Node prev = null;
        Node cur = r[0];
        Node nxt;
        while (cur != null) {
            nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }
        r[0] = prev;
    }

    public static void freeList(Node Node) {
        Node temp;
        while (Node != null) {
            temp = Node;
            Node = Node.next;
            // In Java, garbage collection takes care of freeing memory.
        }
    }

    public static void printList(Node Node) {
        while (Node != null) {
            System.out.print(Node.data + " ");
            Node = Node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            Node[] first = new Node[1];
            Node[] second = new Node[1];
            first[0] = null;
            second[0] = null;

            String input = sc.nextLine();
            String[] arr = input.split(" ");
            for (String s : arr) {
                push(first, Integer.parseInt(s));
            }

            String input2 = sc.nextLine();
            String[] brr = input2.split(" ");
            for (String s : brr) {
                push(second, Integer.parseInt(s));
            }

            reverse(first);
            reverse(second);

            Solution ob = new Solution();
            long res = ob.multiplyTwoLists(first[0], second[0]);
            System.out.println(res);

            // Free list is not necessary in Java
        }

        sc.close();
    }
}

// A new concept learned about 10^9+7 modulo operation, which is used to keep the numbers being calculated within the range.
// Time complexity: O(n)
// Space complexity: O(1)