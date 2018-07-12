package org.anshuman.leetcode;

import org.anshuman.utilities.ListNode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 *  
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * 
 * 
 * @author anshuman
 *
 */
public class Q002 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode solutionHead = new ListNode(0);
        int carry = 0;
        ListNode x = l1;
        ListNode y = l2;
        ListNode curr = solutionHead;
        while(x != null || y!= null) {
            int x_val = (x != null) ? x.val : 0;
            int y_val = (y != null) ? y.val : 0;
            int sum = x_val + y_val + carry;
            curr.next = new ListNode(sum % 10);
            carry = sum / 10;
            curr = curr.next;
            if(x != null) x = x.next;
            if(y != null) y = y.next;
        }
        if(carry > 0) 
            curr.next = new ListNode(carry);
        return solutionHead.next;
    }
	

}
