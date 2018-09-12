package org.anshuman.leetcode;

import static org.junit.Assert.*;
import org.junit.*;
import org.anshuman.utilities.TreeNode;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Q112Test {
	Q112 q112;

	@Before
	public void setUp() throws Exception {
		q112 = new Q112();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStandard() {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		
		root.right = new TreeNode(8);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(1);
		
		boolean result = q112.hasPathSum(root, 22);
		assertTrue(result == true);
	}
	
	@Test
	public void testFail() {
		TreeNode root = new TreeNode(7);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		
		root.right = new TreeNode(8);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(1);
		
		boolean result = q112.hasPathSum(root, 22);
		assertTrue(result == false);
	}

}
