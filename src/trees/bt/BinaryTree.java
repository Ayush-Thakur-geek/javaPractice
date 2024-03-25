package trees.bt;

import java.util.Scanner;

public class BinaryTree {
    public BinaryTree() {

    }
    public static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner in) {
        System.out.println("Enter the root Node: ");
        int value = in.nextInt();
        root = new Node(value);
        populate(in, root);
    }
    private void populate(Scanner in, Node node) {
        System.out.println("Do you want to add a left child to " + node.value + "? (y/n)");
        if (in.next().trim().equalsIgnoreCase("y")) {
            System.out.println("Enter the value of the left child: ");
            int value = in.nextInt();
            node.left = new Node(value);
            populate(in, node.left);
        }
        System.out.println("Do you want to add a right child to " + node.value + "? (y/n)");
        if (in.next().trim().equalsIgnoreCase("y")) {
            System.out.println("Enter the value of the right child: ");
            int value = in.nextInt();
            node.right = new Node(value);
            populate(in, node.right);
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
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|----->" + node.value);
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
        }
        System.out.println(node.value);
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
        System.out.println(node.value);
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
        System.out.println(node.value);
    }
}