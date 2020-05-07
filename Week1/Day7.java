// Complexity
// Time: O(N)
// Space: O(h), where h is the height of the binary tree

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    TreeNode xParent = null;
    TreeNode yParent = null;
    int xDepth = -1;
    int yDepth = -2;

    public boolean isCousins(TreeNode root, int x, int y) {
        int depth = 0;
        dfs(root, null, x, y, depth);
        return xDepth == yDepth && xParent != yParent;
    }

    void dfs(TreeNode root, TreeNode parent, int x, int y, int depth) {
        if (root == null)
            return;
        if (x == root.val) {
            xParent = parent;
            xDepth = depth;
        } else if (y == root.val) {
            yParent = parent;
            yDepth = depth;
        } else {
            // if we found x node or found y node then we don't need to dfs deeper
            // because x and y must be the same depth
            dfs(root.left, root, x, y, depth + 1);
            dfs(root.right, root, x, y, depth + 1);
        }
    }
}