import org.junit.Assert;
import org.junit.Test;

public class RCharTest {

    @Test
    public void testGetFirstCharacter() {
        String helloWorld = "hello world";
        RChar rChar = RChar.getFirstCharacter(helloWorld);
        Assert.assertEquals(rChar.toString(), "h");
    }

    @Test
    public void testEquals() {
        RChar rChar = new RChar('k');
        RChar rChar2 = new RChar('k');
        Assert.assertEquals("Are they Equal", rChar, rChar2);
    }

    @Test
    public void testEquals2() {
        RChar rChar = new RChar('k');
        RChar rChar2 = new RChar('1');
        Assert.assertNotEquals(rChar, rChar2);
    }

    @Test
    public void testHashCode() {
        RChar rChar = new RChar('k');
        RChar rChar2 = new RChar('k');
        Assert.assertEquals(rChar.hashCode(), rChar2.hashCode());
    }

    @Test
    public void testCompareTo() {
        RChar rChar = new RChar('k');
        RChar rChar2 = new RChar('k');
        Assert.assertEquals(rChar.compareTo(rChar2), 0);
    }

    @Test
    public void testCompareTo2() {
        RChar rChar = new RChar('k');
        RChar rChar2 = new RChar('l');
        Assert.assertEquals(rChar.compareTo(rChar2), -1);
    }

    @Test
    public void testCompareTo3() {
        RChar rChar = new RChar('k');
        RChar rChar2 = new RChar('j');
        Assert.assertEquals(rChar.compareTo(rChar2), 1);
    }

    @Test
    public void testGetValueOf() {
        RChar rChar = new RChar('k');
        Assert.assertEquals(rChar.getValueOf(), 107);
    }

    @Test
    public void testIsDigit() {
        RChar rChar = new RChar('k');
        Assert.assertEquals(rChar.isDigit(), false);
    }

    @Test
    public void testIsDigit2() {
        RChar rChar = new RChar('1');
        Assert.assertEquals(rChar.isDigit(), true);
    }

    @Test
    public void testIsLetter() {
        RChar rChar = new RChar('1');
        Assert.assertEquals(rChar.isLetter(), false);
    }

    @Test
    public void testIsLetter2() {
        RChar rChar = new RChar('q');
        Assert.assertEquals(rChar.isLetter(), true);
    }

    @Test
    public void testIsLowerCase() {
        RChar rChar = new RChar('a');
        Assert.assertTrue(rChar.isLowerCase());
    }

    @Test
    public void testIsUpperCase() {
        RChar rChar = new RChar('A');
        Assert.assertTrue(rChar.isUpperCase());
    }

    @Test
    public void testToUpperCase() {
        RChar rChar = new RChar('k');
        Assert.assertEquals(rChar.toUpperCase(), 'K');
    }

    @Test
    public void testToLowerCase() {
        RChar rChar = new RChar('K');
        Assert.assertEquals(rChar.toLowerCase(), 'k');
    }

    @Test
    public void testIsSpace() {
        RChar rChar = new RChar(' ');
        Assert.assertEquals(rChar.isSpace(), true);
    }
    @Test
    public void testisEmpty() {
        RChar rChar = new RChar(' ');
        Assert.assertTrue(rChar.isEmpty());
    }

}