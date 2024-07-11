package Trees;

import java.util.ArrayList;
import java.util.List;

public class morrisTraversal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        List<Integer> result = inorderTraversal(root);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left == null) {
                ans.add(curr.val);
                curr = curr.right;
            } else {
                TreeNode temp = curr.left;
                while (temp.right != null && temp.right != curr) {
                    temp = temp.right;
                }
                if (temp.right == null) {
                    ans.add(curr.val);
                    temp.right = curr;
                    curr = curr.left;
                } else {
                    temp.right = null;
                    curr = curr.right;
                }
            }
        }
        return ans;
    }
}
