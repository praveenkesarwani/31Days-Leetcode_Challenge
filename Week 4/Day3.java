//Construct Binary Search Tree from Preorder Traversal
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int start = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        int max = Integer.MAX_VALUE;
        return treeBuilder(preorder,max);
    }
    public TreeNode treeBuilder(int[] preorder, int max){
        if(start == preorder.length || preorder[start] > max){
            return null;
        }
        TreeNode root = new TreeNode(preorder[start++]);
        root.left = treeBuilder(preorder, root.val);
        root.right = treeBuilder(preorder, max);
        return root;
    }
}
// Time Complexity: O(n)