package org.anshuman.leetcode;

import org.anshuman.utilities.TreeNode;

/**
 * Given a binary tree and a sum, determine if the tree has
 * a root-to-leaf path such that adding up all the values along
 * the path equals the given sum.
 * 
 * @author anshuman
 *
 */
public class Q112 {
	public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        if(root.left == null && root.right == null)
            return root.val == sum;
        else {
            boolean leftCheck = hasPathSum(root.left, sum - root.val);
            boolean rightCheck = hasPathSum(root.right, sum - root.val);
            return leftCheck || rightCheck;
        }
    }
}
