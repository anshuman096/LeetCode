package org.anshuman.leetcode;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class Q001Test extends TestCase {
	Q001 q1;
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public Q001Test( String testName ) {
        super( testName );
        q1 = new Q001();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite( Q001Test.class );
    }

    /**
     * Rigourous Test Cases :-)
     */
    public void testFail() {
        int[] nums = {2, 7, 11, 15};
        int target = 19;
        int[] solution = q1.twoSum(nums, target);
        assertTrue(solution[0] == solution[1]);
    }
    
    
    public void testPass1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] solution = q1.twoSum(nums, target);
        assertTrue(nums[solution[0]] + nums[solution[1]] == target);
    }
    
    
    public void testPass2() {
    	int[] nums = {435, 23, 65, 22, 76, 567, 2212};
    	int target = 632;
    	int[] solution = q1.twoSum(nums, target);
    	assertTrue(nums[solution[0]] + nums[solution[1]] == target);
    }
    
    public void testPass3() {
    	int[] nums = {-34, 43, -77, 25};
    	int target = -111;
    	int[] solution = q1.twoSum(nums, target);
    	assertTrue(nums[solution[0]] + nums[solution[1]] == target);
    }
    
    
}
