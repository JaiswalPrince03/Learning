package Trees;

import javax.swing.tree.TreeNode;

public class LC543 {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        return Math.max(leftHeight + rightHeight, Math.max(leftDiameter, rightDiameter));
    }

    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=maxDepth(root.left)+1;
        int right=maxDepth(root.right)+1;
        return Math.max(left,right);
    }
}
