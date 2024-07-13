package Trees;

import Trees.morrisTraversal.TreeNode;

public class LC226 {
    public TreeNode invertTree(TreeNode root) {
        if(root != null){
            TreeNode temp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(temp);
        }
        return root;
    }
    
}
