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
    public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> finalans=new ArrayList<>();
    if(root==null){
        return finalans;
    }
    Queue <TreeNode> queue=new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()){
        int size=queue.size();
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<size;i++){
            TreeNode node=queue.poll();
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
            li.add(node.val);
        }
        finalans.add(li);
    }
    return finalans;
    }
}
