import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void firstTest() {
        int actual = 1;
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }
}
