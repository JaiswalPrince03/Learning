package Trees;

public class inOrder {
    public static void inOrder(Node root) {
        // base case
        if (root == null)
            return;
        // left
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
       
      
    }

}
