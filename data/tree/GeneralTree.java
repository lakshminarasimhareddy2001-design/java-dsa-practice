
import java.util.*;

class GeneralNode {
    int data;
    List<GeneralNode> children = new ArrayList<>();
    public GeneralNode(int data) { this.data = data; }
}

public class GeneralTree {
    // Reading a General Tree requires a loop inside the recursion
static    void printPreOrder(GeneralNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        for (GeneralNode child : node.children) {
            printPreOrder(child);
        }
    }
public static void main(String[] args) {
        GeneralNode root = new GeneralNode(1);
        GeneralNode child1 = new GeneralNode(2);
        GeneralNode child2 = new GeneralNode(3);
        GeneralNode child3 = new GeneralNode(4);

        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);

        child1.children.add(new GeneralNode(5));
        child1.children.add(new GeneralNode(6));

        System.out.println("General Tree Pre-Order:");
        printPreOrder(root);
    }
}
