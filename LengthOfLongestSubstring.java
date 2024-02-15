package org.example;

import java.util.HashSet;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        // Sliding Window
        int n = s.length();
        int maxValue = 0, i = 0, j = 0;

        HashSet<Character> charSet = new HashSet<>();

        while (i < n && j < n) {
            if(!charSet.contains(s.charAt(j))) {
                charSet.add(s.charAt(j));
                j++;
                maxValue = Math.max(maxValue, j - i);
            } else {
                charSet.remove(s.charAt(i));
                i++;
            }
        }
        return maxValue;
    }
}
