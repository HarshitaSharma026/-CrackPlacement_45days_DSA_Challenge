// Easy: https://leetcode.com/problems/valid-palindrome-ii/description/

class Solution {
    public boolean validPalindrome(String s) {

        byte[] chars = s.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1);
        int i = 0, j = s.length() - 1;

        while(i < j) {
            if(chars[i] != chars[j]) {
                return isPalindrome(chars, i + 1, j) || isPalindrome(chars, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isPalindrome(byte[] chars, int i , int j) {
        while(i < j) {
            if(chars[i] != chars[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

// 2 methods - revise again
// 1. direct string comparison with the logic that if first and last chars are not equal, use palindrome() method to check of both time without i and without j
// complexity = o(n)

// 2. where string is converted into byte[] char array 