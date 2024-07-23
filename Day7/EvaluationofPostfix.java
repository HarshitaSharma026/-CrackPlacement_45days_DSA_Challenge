// Easy: https://www.geeksforgeeks.org/problems/evaluation-of-postfix-expression1735/1

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int a = stack.pop();
                int b = stack.pop();
                if(ch == '+') {
                    stack.push(b + a);
                }
                else if (ch == '-') {
                    stack.push(b - a);
                }
                else if (ch == '*') {
                    stack.push(b * a);
                }
                else if (ch == '/') {
                    stack.push(b / a);
                }
            }
            else {
                stack.push(Integer.parseInt(String.valueOf(ch)));
            }
        }
        return stack.pop();
    }
}

// Time complexity: O(n), n the length of string
// Space complexity: O(n), for stack