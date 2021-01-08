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
        Assert.assertEquals("Are they Equal",rChar, rChar2);
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
}