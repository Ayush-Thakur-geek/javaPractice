package trees.bt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        bt.populate(in);
//        bt.display();
        bt.prettyDisplay();
        System.out.println();
        bt.preOrder();
        System.out.println();
        bt.inOrder();
        System.out.println();
        bt.postOrder();
    }
}
