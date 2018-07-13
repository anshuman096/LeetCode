package org.anshuman.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * 
 * @author anshuman
 *
 */
public class Q003 {
	public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int beginning = 0;
        int end = 0;
        Set<Character> charSet = new HashSet<Character> ();
        
        while(beginning < s.length() && end < s.length()) {
            if(!charSet.contains(s.charAt(end))) {
                charSet.add(s.charAt(end++));
                maxLength = Math.max(maxLength, end - beginning);
            } else 
                charSet.remove(s.charAt(beginning++));
        } 
        return maxLength;
    }

}
