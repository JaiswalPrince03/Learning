package Trees;

public class prinTree {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static Node createTree(int[] array, int index) {
        if (index >= array.length || array[index] == 0) {
            return null;
        }
        Node node = new Node(array[index]);
        node.left = createTree(array, 2 * index + 1);
        node.right = createTree(array, 2 * index + 2);
        return node;
    }

    public static void printTree(Node node, String indent, boolean last) {
        if (node != null) {
            System.out.print(indent);
            if (last) {
                System.out.print("R----");
                indent += "     ";
            } else {
                System.out.print("L----");
                indent += "|    ";
            }

            System.out.println(node.data);
            printTree(node.left, indent, false);
            printTree(node.right, indent, true);
        }
    }

    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7};
        Node root=createTree(array,0);
        printTree(root,"",true);
    }
}
