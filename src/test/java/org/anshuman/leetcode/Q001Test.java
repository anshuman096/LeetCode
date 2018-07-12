/**
 * 
 */
package org.anshuman.leetcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author anshuman
 *
 */
public class Q001Test {
	Q001 q1;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		q1 = new Q001();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
    public void testFail() {
        int[] nums = {2, 7, 11, 15};
        int target = 19;
        int[] solution = q1.twoSum(nums, target);
        assertTrue(solution[0] == solution[1]);
    }
    
    @Test
    public void testPass1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] solution = q1.twoSum(nums, target);
        assertTrue(nums[solution[0]] + nums[solution[1]] == target);
    }
    
    @Test
    public void testPass2() {
    	int[] nums = {435, 23, 65, 22, 76, 567, 2212};
    	int target = 632;
    	int[] solution = q1.twoSum(nums, target);
    	assertTrue(nums[solution[0]] + nums[solution[1]] == target);
    }
    
    @Test
    public void testPass3() {
    	int[] nums = {-34, 43, -77, 25};
    	int target = -111;
    	int[] solution = q1.twoSum(nums, target);
    	assertTrue(nums[solution[0]] + nums[solution[1]] == target);
    }

}
