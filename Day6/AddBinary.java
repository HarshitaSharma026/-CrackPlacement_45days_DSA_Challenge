// https://leetcode.com/problems/add-binary/

// solution in NB
class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) {
                carry = carry + aa[i--] - '0';
            }
            if (j >= 0) {
                carry = carry + bb[j--] - '0';
            }
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}