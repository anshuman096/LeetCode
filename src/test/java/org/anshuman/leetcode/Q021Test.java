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
	
	

}
