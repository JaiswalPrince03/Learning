package Trees;

import javax.swing.tree.TreeNode;

public class LC226 {
    public TreeNode invertTree(TreeNode root) {
        if(root != null){
            root.left = invertTree(root.left);
            root.right = invertTree(root.right);
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        return root;
    }
    
}
