package Trees;

import Trees.morrisTraversal.TreeNode;

public class LC105 {
    public TreeNode BT(int[] preorder, int[] inorder, int ISI, int IEI, int PSI,
            int PEI) {
        // base case
        if (PSI > PEI || ISI > IEI) {
            return null;
        }

        // recursive case
        TreeNode root = new TreeNode(preorder[PSI]);
        // find the index of the root in the inorder array
        int inIndex = ISI;
        while (inIndex <= IEI) {
            if (inorder[inIndex] == preorder[PSI]) {
                break;
            }
            inIndex++;
        }
        // construct the left subtree
        root.left = BT(preorder, inorder, ISI, inIndex - 1, PSI + 1,
                PSI + inIndex - ISI);
        // construct the right subtree
        root.right = BT(preorder, inorder, inIndex + 1, IEI, PSI + inIndex - ISI + 1,
                PEI);
        return root;

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0) {
            return null;
        }
        return BT(preorder, inorder, 0, inorder.length - 1, 0, preorder.length - 1);
    }
}
