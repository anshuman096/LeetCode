package org.anshuman.leetcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Q005Test {
	
	Q005 q5;

	@Before
	public void setUp() throws Exception {
		q5 = new Q005();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPass() {
		String test = "cbbd";
		String result = q5.longestPalindrome(test);
		assertTrue(result.equals("bb"));
	}
	
	@Test
	public void testStringWithMultiplePalindromes() {
		String test = "babad";
		String result = q5.longestPalindrome(test);
		assertTrue(result.equals("aba"));
	}
	
	@Test
	public void testStringWithNoPalindromes() {
		String test = "abcdefg";
		String result = q5.longestPalindrome(test);
		assertTrue(result.equals("g")); //algorithm considers single letters as palindromes
	}
	
	@Test
	public void testNoString() {
		String test = "";
		String result = q5.longestPalindrome(test);
		assertTrue(result.equals(""));
	}

}
