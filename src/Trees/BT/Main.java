package Trees.BT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
        BinaryTree bt = new BinaryTree();
        bt.populate(in);
        bt.prettyDisplay();
        bt.preOrder();
        System.out.println();
        bt.inOrder();
        System.out.println();
        bt.postOrder();
    }
}
