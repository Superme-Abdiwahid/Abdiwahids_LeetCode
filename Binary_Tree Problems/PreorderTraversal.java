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
class  PreorderTraversal {
    
    public List<Integer> preorderTraversal(TreeNode root) throws RuntimeException{
        List<Integer> list = new LinkedList<>();
        preorderTraversal(root, list);
        return list;
    }
    
    
     public void preorderTraversal(TreeNode root, List<Integer> list) throws RuntimeException{
        if(root == null){
            return;
        }else{
            list.add(root.val);
             preorderTraversal(root.left, list);
            preorderTraversal(root.right, list);
            
        }
    }
}
