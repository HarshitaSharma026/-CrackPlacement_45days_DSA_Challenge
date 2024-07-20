// Easy: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            int len = needle.length();
            for(int i = 0; i < haystack.length(); i++) {
                String sub = haystack.substring(i, i+len);
                if (sub.equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}