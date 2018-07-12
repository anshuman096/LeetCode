package org.anshuman.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target. 
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * @author anshuman
 */
public class Q001 {
	
	public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        
        int[] sol = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; 
            if(map.containsKey(complement) && map.get(complement) != i) {
                sol[0] = map.get(complement);
                sol[1] = i;
            }
        }
        return sol;
    }
	
}
