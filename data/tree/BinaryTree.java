class Node {
    int data;
    Node left, right;
    public Node(int val) { data = val; }
}

public class BinaryTree {
    Node root;

    // DFS: In-Order Traversal (Left, Root, Right)
  
  void printInOrder(Node node) {
        if (node == null) return;
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }
public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        /* Let's create this structure:
                 1
                / \
               2   3
              / \
             4   5
        */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("In-Order Traversal:");
        tree.printInOrder(tree.root); 
        // Expected Output: 4 2 5 1 3 
    }
}
