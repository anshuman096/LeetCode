package org.anshuman.leetcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Q003Test {
	Q003 q3;

	@Before
	public void setUp() throws Exception {
		q3 = new Q003();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPass() {
		String str = "abcdabbccdef";
		int longestSubStringLength = q3.lengthOfLongestSubstring(str);
		assertTrue(longestSubStringLength == 4); //abc
	}
	
	@Test
	public void testOneCharacterString() {
		String str = "bbbbbbbb";
		int longestSubStringLength = q3.lengthOfLongestSubstring(str);
		assertTrue(longestSubStringLength == 1); //b
	}
	
	@Test
	public void testEmptyString() {
		String str = "";
		int longestSubStringLength = q3.lengthOfLongestSubstring(str);
		assertTrue(longestSubStringLength == 0);
	}
	
	@Test
	public void testAgainstSubSequence() {
		String str = "pwwkew";
		int longestSubStringLength = q3.lengthOfLongestSubstring(str);
		assertTrue(longestSubStringLength == 3);
	}

}
