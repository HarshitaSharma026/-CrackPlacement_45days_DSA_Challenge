// Easy: https://leetcode.com/problems/longest-common-prefix/description/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        // String first = strs[0];
        // String last = strs[strs.length - 1];
        byte[] first = strs[0].getBytes(java.nio.charset.StandardCharsets.ISO_8859_1);
        byte[] last = strs[strs.length - 1].getBytes(java.nio.charset.StandardCharsets.ISO_8859_1);

        StringBuffer str = new StringBuffer();
        int i = 0;
        while(i < first.length() && i < last.length()) {
            if(first.charAt(i) != last.charAt(i)) {
                break;
            }
            str.append(first.charAt(i));
            i++;
        }

        // int i = 0;
        // while(i < first.length && i < last.length) {
        //     if(first[i] != last[i]) {
        //         break;
        //     }
        //     String s = new String(first[i], java.nio.charset.StandardCharsets.UTF_8);
        //     str.append(s);
        //     i++;
        // }

        return str.toString();
    }

    // Revise again
// new concept on lexicographically sorting 
// time complexity = O(nlogn + m)
// space complexity = o(1)
}