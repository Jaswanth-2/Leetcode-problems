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
    Boolean isMirror(TreeNode p,TreeNode q){
        if(p==null &&  q==null){
            return true;
        }
        if(p!=null && q!=null && q.val==p.val){
            return isMirror(p.left,q.right)&& isMirror(p.right,q.left); 
        }
        return false;
    }
    public boolean isSymmetric(TreeNode r) {
        if(r==null) return true;
        return isMirror(r.left,r.right); 
    }
}
