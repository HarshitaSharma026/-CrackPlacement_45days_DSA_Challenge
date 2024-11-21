// Easy: https://leetcode.com/problems/excel-sheet-column-title/


class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuffer str = new StringBuffer();
        int n = columnNumber;
        while(n > 0) {
            n--;
            int rem = n % 26;
            char curr = (char) (rem + 'A');
            str.append(curr);
            n /= 26;
        }
        return str.reverse().toString();
    }
}

// Revise again 