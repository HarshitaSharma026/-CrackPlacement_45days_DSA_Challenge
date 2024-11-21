import java.util.*;

class PrintAllDuplicates {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int[] chars = new int[26];
        // a = 97
        for(int i = 0; i < str.length(); i++) {
            chars[str.charAt(i) - 97]++;
        }
        for(int i = 0; i < chars.length; i++) {
            if (chars[i] > 1) {
                System.out.println((char)(i + 97) +", "+ chars[i]);
            }
        }
    }
}