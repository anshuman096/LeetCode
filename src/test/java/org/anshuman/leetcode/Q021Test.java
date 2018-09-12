package org.anshuman.leetcode;

import static org.junit.Assert.*;
import org.junit.*;
import org.anshuman.utilities.ListNode;

public class Q021Test {
	Q021 q21;

	@Before
	public void setUp() throws Exception {
		q21 = new Q021();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBasic() {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(3);
		ListNode l3 = new ListNode(5);
		
		l1.next = l2;
		l2.next = l3;
		
		ListNode l4 = new ListNode(2);
		ListNode l5 = new ListNode(4);
		ListNode l6 = new ListNode(6);
		
		l4.next = l5;
		l5.next = l6;
		
		ListNode mergedHead = q21.mergeTwoLists(l1, l4);
		ListNode curr = mergedHead;
		for(int i = 1; i <= 6; i++) {
			assertEquals(curr.val, i);
			curr = curr.next;
		}
	}
	
	@Test
	public void testDuplicateValues() {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(2);
		
		l1.next = l2;
		l2.next = l3;
		
		ListNode l4 = new ListNode(1);
		ListNode l5 = new ListNode(4);
		ListNode l6 = new ListNode(10);
		
		l4.next = l5;
		l5.next = l6;
		
		ListNode mergedHead = q21.mergeTwoLists(l1, l4);
		ListNode curr = mergedHead;
		assertEquals(curr.val, 1);
		curr = curr.next;
		assertEquals(curr.val, 1);
		curr = curr.next;
		assertEquals(curr.val, 1);
		curr = curr.next;
		assertEquals(curr.val, 2);
		curr = curr.next;
		assertEquals(curr.val, 4);
		curr = curr.next;
		assertEquals(curr.val, 10);
		curr = curr.next;
	}
	
	@Test
	public void testDifferentLengthLists() {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(3);
		ListNode l3 = new ListNode(4);
		
		l1.next = l2;
		l2.next = l3;
		
		ListNode l4 = new ListNode(2);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		ListNode l7 = new ListNode(7);
		ListNode l8 = new ListNode(8);
		ListNode l9 = new ListNode(9);
		
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		l7.next = l8;
		l8.next = l9;
		
		ListNode mergedHead = q21.mergeTwoLists(l1, l4);
		ListNode curr = mergedHead;
		for(int i = 1; i <= 9; i++) {
			assertEquals(curr.val, i);
			curr = curr.next;
		}
	}
	
	

}
