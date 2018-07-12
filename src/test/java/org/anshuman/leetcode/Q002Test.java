package org.anshuman.leetcode;

import static org.junit.Assert.*;

import org.anshuman.utilities.ListNode;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Q002Test {
	
	Q002 q2;

	@Before
	public void setUp() throws Exception {
		q2 = new Q002();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPass() {
		ListNode numOne = new ListNode(2);
		ListNode numTwo = new ListNode(3);
		ListNode solution = q2.addTwoNumbers(numOne, numTwo);
		assertTrue(solution.val == 5);
	}
	
	@Test
	public void testNull() {
		ListNode numOne = null;
		ListNode numTwo = null;
		ListNode solution = q2.addTwoNumbers(numOne, numTwo);
		assertNull(solution);
	}
	
	@Test
	public void testOneNullNode() {
		ListNode numOne = null;
		ListNode numTwo = new ListNode(2);
		ListNode solution = q2.addTwoNumbers(numOne, numTwo);
		assertTrue(solution.val == 2);
	}
	
	@Test
	public void carry() {
		ListNode numOne = new ListNode(5);
		ListNode numTwo = new ListNode(6);
		ListNode solution = q2.addTwoNumbers(numOne, numTwo);
		assertTrue(solution.val == 1);
		assertTrue(solution.next.val == 1);
	}
	
	@Test
	public void multipleNodeNumbers() {
		ListNode hundredsOne = new ListNode(3);
		ListNode tensOne = new ListNode(2);
		ListNode onesOne = new ListNode(4);
		
		hundredsOne.next = tensOne;
		tensOne.next = onesOne;
		
		ListNode hundredsTwo = new ListNode(2);
		ListNode tensTwo = new ListNode(4);
		ListNode onesTwo = new ListNode(2);
		
		hundredsTwo.next = tensTwo;
		tensTwo.next = onesTwo;
		
		ListNode solution = q2.addTwoNumbers(hundredsOne, hundredsTwo);
		
		assertTrue(solution.val == 5);
		assertTrue(solution.next.val == 6);
		assertTrue(solution.next.next.val == 6);
	}

}
