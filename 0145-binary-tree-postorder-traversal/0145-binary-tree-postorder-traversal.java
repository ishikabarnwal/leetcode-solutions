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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrder=new ArrayList<>();
        
        dfs(root,postOrder);
        return postOrder;
    }
    void dfs( TreeNode root , List<Integer> postOrder){
        if(root==null)return;

        dfs(root.left,postOrder);
        dfs(root.right,postOrder);
        postOrder.add(root.val);
    }
}