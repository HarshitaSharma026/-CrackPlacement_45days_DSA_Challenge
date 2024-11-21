package dsa_challenge;

import java.util.HashMap;
import java.util.*;
public class PrintAllDuplicates {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int[] count = new int[26];
        for(int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 97]++;
        }

        for(int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                System.out.println((char)(i + 97) + ", " + count[i]);
            }
        }
    }
}
