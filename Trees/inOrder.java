package Trees;

import Trees.prinTree.Node;

public class inOrder {
    public static void Order(Node root) {
        if (root == null) {
            return;
        }
        Order(root.left);
        System.out.print(root.data + " ");
        Order(root.right);
    }

    public static void main(String[] args) {
    }
}
