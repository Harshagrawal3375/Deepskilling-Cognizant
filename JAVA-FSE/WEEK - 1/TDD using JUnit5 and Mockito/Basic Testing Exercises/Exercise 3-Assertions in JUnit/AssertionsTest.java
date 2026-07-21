import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        int actual = 5;
        assertEquals(5, actual);
        assertTrue(actual > 3);
        assertNotNull(actual);
    }

    @Test
    public void testStringAssertions() {
        String str = "Hello";
        assertEquals("Hello", str);
        assertTrue(str.startsWith("He"));
        assertNotNull(str);
    }

    @Test
    public void testArrayAssertions() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual);
    }
}
