package Trees;

import java.util.ArrayList;
import java.util.List;
import javax.swing.tree.TreeNode;

public class LC145 {
    public static void postOrder(TreeNode root, List<Integer> ans) {

        /*
         * // 1st Approach using 2 Stack
         * // base case
         * if (root == null)
         * return;
         * Stack <TreeNode> S1=new Stack<>();
         * Stack <TreeNode> S2=new Stack<>();
         * S1.push(root);
         * while(!S1.isEmpty()){
         * root=S1.pop();
         * S2.push(root);
         * if(root.left!=null){
         * S1.push(root.left);
         * }
         * if(root.right!=null){
         * S1.push(root.right);
         * }
         * }
         * while(!S2.isEmpty()){
         * root=S2.pop();
         * ans.add(root.val);
         * }
         * 
         * .............................................................................
         * .......
         */

        /*
         * //2nd approach using Recursion
         * // base case
         * if (root == null)
         * return;
         * 
         * // left
         * 
         * postOrder(root.left,ans);
         * 
         * postOrder(root.right,ans);
         * ans.add(root.val);
         * .............................................................................
         * ..........
         */

       /* // 3rd approach using 1 stack
        Stack<TreeNode> st = new Stack<>();
        if(root==null){
            return ans;
        }
        st.push(root);
        while(!st.isEmpty()){
            TreeNode topTree= st.peek();
            if(topTree.left != null){
                //left tree exists
                TreeNode leftTree= topTree.left;
                topTree.left=null;
                st.push(leftTree);
            } else if(topTree.right!=null){
                //right tree exists
                TreeNode rightTree=topTree.right;
                topTree.right=null;
                st.push(rightTree);
            } else {
                ans.add(topTree.val);
                st.pop();        
            }
        }
        return ans; */
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postOrder(root, ans);
        return ans;
    }

}
