// Medium: https://leetcode.com/problems/reverse-words-in-a-string/description/


// METHOD 1 ----------- using stacks and replaceAll()
class Solution {
    public String reverseWords(String s) {
        String[] stack = new String[1000];
        int top = -1;
        s = s.trim().replaceAll("\\s+", " ");
        StringBuilder str = new StringBuilder();
        int i = 0;
        while(i < s.length()) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                str.append(ch);
            }
            else {
                top += 1;
                stack[top] = str.toString();
                str.setLength(0);
            }
            i++;
        }
        if(str.length() > 0) {
            top += 1;
            stack[top] = str.toString();
        }
        // traverse stack
        StringBuilder ans = new StringBuilder();
        while(top >= 0) {
            ans.append(stack[top]);
            top -= 1;
            if(top >= 0) {
                ans.append(" ");
            }
            
        }
        return ans.toString();
    }
} 


// METHOD 2 ----------- using split() 
class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        int left = 0;
        int right = str.length - 1;
        while(left < right) {
            String temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
        return String.join(" ", str);
    }
}

/*
    Two different ways to solve the question: 
1. Using stacks, to reverse the words
Time complexity: O(n)
Space complexity: O(n), n being size of stack

2. To convert the string into string array using split() function and swap first and last words in the array and so on. 
Time complexity: O(n)
Space complexity: O(n)
*/