import org.junit.Test;

import static org.testng.Assert.assertEquals;


public class JUnitTest {
    @Test
    public void getMaxPass() {
        Finder finder = new Finder();
        int[] arr = {1, 2, 3, 4, 5, 6};
        assertEquals(6, finder.findMax(arr));
    }

    @Test
    public void getMaxNull() {
        Finder finder = new Finder();
        int[] arr = null;
        assertEquals(-1, finder.findMax(arr));
    }

    @Test
    public void getMaxEmpty() {
        Finder finder = new Finder();
        int[] arr;
        arr = new int[0];
        assertEquals(-1, finder.findMin(arr));
    }

    @Test
    public void getMinPass() {
        Finder finder = new Finder();
        int[] arr = {1, 2, 3, 4, 5, 6};
        assertEquals(1, finder.findMin(arr));
    }

    @Test
    public void getMinEmpty() {
        Finder finder = new Finder();
        int[] arr;
        arr = new int[0];
        assertEquals(-1, finder.findMin(arr));
    }

    @Test
    public void getMinNull() {
        Finder finder = new Finder();
        int[] arr = null;
        assertEquals(-1, finder.findMin(arr));
    }


}


