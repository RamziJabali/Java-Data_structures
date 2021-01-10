import org.junit.Assert;
import org.junit.Test;

public class RBinaryTreeTest {
    @Test
    public void testDoesContain(){
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
    public void testDoesContain2(){
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
    public void testRemoveRoot(){
        RBinaryTree tree = new RBinaryTree();
        tree.insert(2);
        tree.insert(0);
        tree.insert(4);
        tree.insert(3);
        tree.insert(5);
        tree.insert(-1);
        tree.insert(1);
       // tree.removeNode(2);
        //Assert.assertEquals(, );
    }
}
