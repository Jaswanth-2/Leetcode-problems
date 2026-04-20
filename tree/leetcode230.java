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
    public void inOrder(TreeNode root, List<Integer> list){
        if(root==null) return;
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> a=new ArrayList<>();
        inOrder(root,a);
        int i=0;
        while(i<a.size()){
            if((i+1)==k) return a.get(i);
            i++;
        }
        return -1;
    }
}
