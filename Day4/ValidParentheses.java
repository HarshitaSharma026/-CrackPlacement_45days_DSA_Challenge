// Easy: https://leetcode.com/problems/valid-parentheses/description/

// REVISION NEEDED
class Solution {
    public boolean isValid(String s) {
        
        char[] stack = new char[s.length()];
        int top = -1;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') {
                // push it into stack
                stack[++top] = ch;
            }
            else {
                if(top == -1) {
                    return false;
                }
                char topvalue = stack[top];
                // check of )
                if(ch == ')') {
                    if(topvalue != '(') {
                        return false;
                    }
                    top--;
                }
                // check of ]
                if(ch == ']') {
                    if(topvalue != '[') {
                        return false;
                    }
                    top--;
                }
                // check of }
                if(ch == '}') {
                    if(topvalue != '{') {
                        return false;
                    }
                    top--;
                }
            }
        }
        // if stack is not empty means mismatch in parentheses
        if(top != -1) {
            return false;
        }
        return true;
    }
}

