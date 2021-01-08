import org.junit.Assert;
import org.junit.Test;

public class RStringTest {
    @Test
    public void testGetRCharArray() {
        RString rString = new RString("hello");
        RChar[] rChars = new RChar[5];
        rChars[0] = new RChar('h');
        rChars[1] = new RChar('e');
        rChars[2] = new RChar('l');
        rChars[3] = new RChar('l');
        rChars[4] = new RChar('o');
        Assert.assertEquals(rString.getRCharArray(), rChars);
    }

    @Test
    public void testGetReverse() {
        RString rString = new RString("olleh");
        Assert.assertEquals(rString.getReverse().toString(), "hello");
    }

    @Test
    public void testGetSize() {
        RString rString = new RString("olleh");
        Assert.assertEquals(rString.getSize(), 5);
    }

    @Test
    public void testisEmpty() {
        RString rString = new RString("");
        Assert.assertTrue(rString.isEmpty());
    }

    @Test
    public void testEquals() {
        RString rString = new RString("hello");
        RString rString2 = new RString("hello");
        Assert.assertTrue(rString.equals(rString2));
    }

    @Test
    public void testHashCode() {
        RString rString = new RString("hello");
        Assert.assertEquals(rString.hashCode(), -1220935314);
    }

    @Test
    public void testCompareTo1() {
        RString rString = new RString("hello");
        RString rString2 = new RString("heflo");
        Assert.assertEquals(rString.compareTo(rString2), 1);
    }

    @Test
    public void testCompareTo2() {
        RString rString = new RString("hello");
        RString rString2 = new RString("hemlo");
        Assert.assertEquals(rString.compareTo(rString2), -1);
    }

    @Test
    public void testCompareTo3() {
        RString rString = new RString("hello");
        RString rString2 = new RString("hello");
        Assert.assertEquals(rString.compareTo(rString2), 0);
    }
}
