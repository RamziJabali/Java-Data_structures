public class Tester {
    public static void main(String[] args) {
        RBinaryTree<Integer> tree = new RBinaryTree<Integer>();
        tree.insert(2);
        tree.insert(7);
        tree.insert(0);
        tree.insert(1);
        tree.insert(-1);
        tree.insert(4);
        tree.insert(8);
        tree.insert(9);
        tree.insert(5);
        tree.insert(6);
        tree.showTree();
        tree.removeData(4);
        tree.removeData(5);
        tree.removeData(6);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        tree.showTree();
    }
}
