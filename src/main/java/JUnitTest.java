import org.junit.Test;

import static org.testng.Assert.assertEquals;


public class JUnitTest {
    @Test
    public void getMaxPass() {
        hello.Finder finder = new hello.Finder();
        int[] arr = {1, 2, 3, 4, 5, 6};
        assertEquals(6, hello.Finder.findMax(arr));
    }

    @Test
    public void getMinPass() {
        hello.Finder finder = new hello.Finder();
        int[] arr = {1, 2, 3, 4, 5, 6};
        assertEquals(1, hello.Finder.findMin(arr));
    }
}
