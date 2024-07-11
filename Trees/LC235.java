package Trees;

public class LC235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // base case
        if(root==null){
            return null;
        }
        while(root!=null){
            if(root.val>p.val&&root.val>q.val){
                root=root.left;
            }else if(root.val<p.val&&root.val<q.val){
                root=root.right;
            }else{
                return root;
            }
        }
        return null;
    }
}
