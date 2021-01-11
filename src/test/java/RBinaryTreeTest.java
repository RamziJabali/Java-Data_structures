import org.junit.Assert;
import org.junit.Test;

public class RBinaryTreeTest {
    @Test
    public void testDoesContain() {
        RBinaryTree tree = new RBinaryTree();
        tree.insert(2);
        tree.insert(0);
        tree.insert(4);
        tree.insert(3);
        tree.insert(5);
        tree.insert(-1);
        tree.insert(1);
        Assert.assertTrue(tree.doesContain(5));
    }

    @Test
    public void testDoesContain2() {
        RBinaryTree tree = new RBinaryTree();
        tree.insert(2);
        tree.insert(0);
        tree.insert(4);
        tree.insert(3);
        tree.insert(5);
        tree.insert(-1);
        tree.insert(1);
        Assert.assertFalse(tree.doesContain(10));
    }

    @Test
    public void testRemoveChildlessLeaf() {
        RBinaryTree tree = new RBinaryTree();
        tree.insert(2);
        tree.insert(0);
        tree.insert(4);
        tree.insert(3);
        tree.insert(5);
        tree.insert(-1);
        tree.insert(1);
        tree.removeData(6);
        Assert.assertFalse(tree.doesContain(6));
    }

    @Test
    public void testRemoveNodeWithOnlyOneChildOnTheRight() {
        RBinaryTree tree = new RBinaryTree();
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
        tree.removeData(4);
        Assert.assertFalse(tree.doesContain(4));
    }

    @Test
    public void testRemoveNodeWithOnlyOneChildOnTheLeft() {
        RBinaryTree tree = new RBinaryTree();
        tree.insert(2);
        tree.insert(7);
        tree.insert(0);
        tree.insert(1);
        tree.insert(-1);
        tree.insert(4);
        tree.insert(8);
        tree.insert(9);
        tree.insert(3);
        tree.removeData(4);
        Assert.assertFalse(tree.doesContain(4));
    }
}
