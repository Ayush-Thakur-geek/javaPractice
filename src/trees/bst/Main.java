package trees.bst;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] nums = {0, 1, 2, 3, 4};
        bst.populateSorted(nums);
        bst.display();
    }
}
