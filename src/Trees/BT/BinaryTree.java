package Trees.BT;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree() {

    }
    private static class Node {
        private int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node root;

    //insert elements
    public void populate(Scanner in) {
        System.out.print("Enter the root no: ");
        int value = in.nextInt();
        root = new Node(value);
        populate(in, root);
    }

    private void populate(Scanner in, Node node) {
        System.out.print("Do you want to enter left of " + node.value + " (answer in y/n) : ");
        String left = in.next().trim();
        if (left.equals("y")) {
            System.out.print("Enter the value of the left of  " + node.value + " : ");
            int value = in.nextInt();
            node.left = new Node(value);
            populate(in, node.left);
        } else if (!left.equals("n")) {
            System.out.println("Invalid Entry!!");
        }
        System.out.print("Do you want to enter right of " + node.value + " (answer in y/n) : ");
        String right = in.next().trim();
        if (right.equals("y")) {
            System.out.print("Enter the value of the right of  " + node.value + " : ");
            int value = in.nextInt();
            node.right = new Node(value);
            populate(in, node.right);
        } else if (!left.equals("n")) {
            System.out.println("Invalid Entry!!");
        }
    }
    public void display() {
        display(root, "");
    }
    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }
    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        prettyDisplay(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|---->" + node.value);
        } else {
            System.out.println(node.value);
        }

        prettyDisplay(node.left, level + 1);
    }

    public void preOrder() {
        preOrder(root);
    }
    private void preOrder(Node node) {
        if (node == null) {
            return;
        } else {
            System.out.print(node.value + " ");
        }
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        inOrder(root);
    }
    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }
    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }
}
