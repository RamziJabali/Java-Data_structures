import org.junit.Assert;
import org.junit.Test;

public class RArrayListTest {
    @Test
    public void testGetListSize(){
        RArrayList <Integer> list =  new RArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Assert.assertEquals(3, list.getListSize());
    }
    @Test
    public void testToString(){
        RArrayList <Integer> list =  new RArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Assert.assertEquals("[1,2,3]", list.toString());
    }
    @Test
    public void testGetReverseArrayList(){
        RArrayList <Integer> list =  new RArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Assert.assertEquals("[3,2,1]", list.getReverseArrayList().toString());
    }
    @Test
    public void testRemoveAtIndexZero(){
        RArrayList <Integer> list =  new RArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.removeAtIndex(0);
        Assert.assertEquals("[2,3]", list.toString());
    }
    @Test
    public void testRemoveAtIndexCenter(){
        RArrayList <Integer> list =  new RArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.removeAtIndex(1);
        Assert.assertEquals("[1,3]", list.toString());
    }
    @Test
    public void testRemoveAtIndexLast(){
        RArrayList <Integer> list =  new RArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.removeAtIndex(2);
        Assert.assertEquals("[1,2]", list.toString());
    }
    @Test
    public void testRemoveAll(){
        RArrayList <Integer> list =  new RArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.removeAll();
        Assert.assertEquals(0, list.getListSize());
    }
    @Test
    public void testRemoveData(){
        RArrayList <Integer> list =  new RArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.removeData(1);
        Assert.assertEquals("[2,3]", list.toString());
    }
    @Test
    public void testAdd(){
        RArrayList <Integer> list =  new RArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Assert.assertEquals( "[1,2,3]",list.toString());
    }
    @Test
    public void testGetLast(){
        RArrayList <Integer> list =  new RArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Assert.assertEquals("3", list.getLast().toString());
    }
    @Test
    public void testGetFirst(){
        RArrayList <Integer> list =  new RArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Assert.assertEquals( "1", list.getFirst().toString());
    }
    @Test
    public void testGetAtIndexCenter(){
        RArrayList <Integer> list =  new RArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Assert.assertEquals( "2", list.getAtIndex(1).toString());
    }
    @Test
    public void testGetAtIndexLast(){
        RArrayList <Integer> list = new RArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Assert.assertEquals( "3", list.getAtIndex(2).toString());
    }
    @Test
    public void testIsEmpty(){
        RArrayList <Integer> list =  new RArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Assert.assertFalse( list.isEmpty());
    }
}
