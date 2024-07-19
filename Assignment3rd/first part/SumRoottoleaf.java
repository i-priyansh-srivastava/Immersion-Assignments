public class SumRoottoleaf {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
            this.left = left;
             this.right = right;
         }
     }
    public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }
    private int dfs(TreeNode node,int val){
        if(node==null){
            return 0;
        }
        val=val*10+node.val;
        if(node.left==null && node.right==null){
            return val;
        }
        return dfs(node.left,val)+dfs(node.right,val);
    }
}
