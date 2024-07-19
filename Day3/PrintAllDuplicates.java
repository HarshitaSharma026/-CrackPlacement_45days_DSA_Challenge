package dsa_challenge;

import java.util.HashMap;

public class PrintAllDuplicates {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            }
            else {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
        }
        // printing
        map.forEach((key, value) -> System.out.println(key +" count = " + value));
    }
}
